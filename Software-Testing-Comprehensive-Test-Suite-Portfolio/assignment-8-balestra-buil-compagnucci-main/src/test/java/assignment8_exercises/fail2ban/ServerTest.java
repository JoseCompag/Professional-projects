package assignment8_exercises.fail2ban;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Assume;
import net.jqwik.api.ForAll;
import net.jqwik.api.GenerationMode;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import static org.junit.jupiter.api.Assertions.*;

public class ServerTest {

    /**
     * Property-based test to verify that after calling the update method on a
     * server,
     * the server's invariant repOk still holds true, more specifically no IPs are
     * left
     * in the bans list with an expire time less than lastUpdate.
     * 
     * @param server the server instance.
     */
    @Property(tries = 1000, generation = GenerationMode.RANDOMIZED)
    public void testUpdate(@ForAll("serverGenerator") Server server) {
        server.update();

        assertTrue(server.repOK(), "Server invariant shouldn't fail after update");
    }

    @Provide
    private Arbitrary<Server> serverGenerator() {
        return Arbitraries.create(this::generateServer);
    }

    private Server generateServer() {
        Server server = new Server();

        int numberOfBans = Arbitraries.integers().between(0, 10).sample();
        int numberOfExceptions = Arbitraries.integers().between(0, 10).sample();

        for (int i = 0; i < numberOfBans; i++) {
            IP ip = generateRandomIP();
            server.addBan(ip);
        }

        for (int i = 0; i < numberOfExceptions; i++) {
            IP ip = generateRandomIP();
            server.addException(ip);
        }

        return server;
    }

    private static IP generateRandomIP() {
        int first = Arbitraries.integers().between(0, 256).sample();
        int second = Arbitraries.integers().between(0, 256).sample();
        int third = Arbitraries.integers().between(0, 256).sample();
        int fourth = Arbitraries.integers().between(0, 256).sample();

        return new IP(first, second, third, fourth);
    }
}