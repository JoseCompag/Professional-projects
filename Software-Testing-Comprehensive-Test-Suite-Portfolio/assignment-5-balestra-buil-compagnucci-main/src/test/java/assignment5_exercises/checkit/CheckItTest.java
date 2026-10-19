package assignment5_exercises.checkit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckItTest {

    /**
     * Casos de test que satisfacen el criterio CACC para el predicado:
     *                  p = a && (b || c)
     */
    @ParameterizedTest
    @MethodSource("testSuiteT1Provider")
    void testCheckItWithCACC(boolean a, boolean b, boolean c, boolean expected) {
        CheckIt checkIt = new CheckIt();

        boolean result = checkIt.checkIt(a, b, c);

        assertEquals(expected, result, "Expected result is not equal to the actual result");
    }

    // Tests suite for CACC coverage
    private static Stream<Arguments> testSuiteT1Provider() {
        return Stream.of(
                // a = true, b = true, c = true
                Arguments.of(true, true, true, true),
                // a = true, b = true, c = false
                Arguments.of(true, true, false, true),
                // a = true, b = false, c = true
                Arguments.of(true, false, true, true),
                // a = true, b = false, c = false
                Arguments.of(true, false, false, false),
                // a = false, b = true, c = true
                Arguments.of(false, true, true, false),
                // a = false, b = true, c = false
                Arguments.of(false, true, false, false),
                // a = false, b = false, c = true
                Arguments.of(false, false, true, false)
        );
    }

    /**
     * Casos de test que satisfacen el criterio de cobertura de aristas para el predicado:
     *                 p = a && (b || c)
     */
    @ParameterizedTest
    @MethodSource("testSuiteT2Provider")
    void testCheckItExpandWithEdgeCoverage(boolean a, boolean b, boolean c, boolean expected) {
        CheckIt checkIt = new CheckIt();

        boolean result = checkIt.checkItExpand(a, b, c);

        assertEquals(expected, result, "Expected result is not equal to the actual result");
    }

    // Tests suite for edge coverage
    private static Stream<Arguments> testSuiteT2Provider() {
        return Stream.of(
                // Tests path covered: [1,3,8]
                Arguments.of(false, false, false, false),
                // Tests path covered: [1,2,4,8]
                Arguments.of(true, true, false, true),
                // Tests path covered: [1,2,5,7,8]
                Arguments.of(true, false, false, false),
                // Tests path covered: [1,2,5,6,8]
                Arguments.of(true, false, true, true)
        );
    }
}