package assignment8_exercises.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

public class IPBlacklistTest {

    private IPBlacklist ipblacklist;
    private LoginService service;

    @BeforeEach
    public void setUp() {
        ipblacklist = new IPBlacklist();
        service = createMock(LoginService.class);
        ipblacklist.setService(service);
    }

    @Test
    public void testBlackListAfterThreeFailiedLoginsWithEasyMock() {
        expect(service.login(anyString(), anyString(), anyString())).andReturn(false).times(3);
        replay(service);

        ipblacklist.login("192.168.0.112", "username", "password");
        ipblacklist.login("192.168.0.112", "username", "password");
        ipblacklist.login("192.168.0.112", "username", "password");

        assertTrue(ipblacklist.blacklisted("192.168.0.112"), "IP should be blacklisted");
    }

    @Test
    public void testBlackListAfterLessThanThreeTriesWithEasyMock() {
        expect(service.login(anyString(), anyString(), anyString())).andReturn(false).times(2);
        replay(service);

        ipblacklist.login("192.168.0.112", "username", "password");
        ipblacklist.login("192.168.0.112", "username", "password");

        assertFalse(ipblacklist.blacklisted("192.168.0.112"), "IP shouldn't be blacklisted");
    }
}