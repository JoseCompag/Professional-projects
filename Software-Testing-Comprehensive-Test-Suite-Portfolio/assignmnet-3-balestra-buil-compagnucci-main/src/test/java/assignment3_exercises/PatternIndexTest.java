package assignment3_exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Characteristics used to generate tests for the method patternIndex(String subject, String pattern):
 * C1: validity of subject (null, " ", subject.length >= 1)
 * C2: validity of pattern (null, " ", pattern.length >= 1)
 * C3: relationship lengths (pattern.length > subject.length, pattern.length == subject.length, pattern.length < subject.length)
 * C4: relationship between subject and pattern (pattern equals subject, pattern doesn't appear in subject, pattern appears in subject)
 */
class PatternIndexTest {

    @ParameterizedTest
    @MethodSource("patternsProviders")
    void testPatternIndexReturnsExpectedResult(String subject, String pattern, int expected) {
        int result = PatternIndex.patternIndex(subject, pattern);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> patternsProviders() {
        return Stream.of(
                // (C1-b2, C2-b2, C3-b2, C4-b2)
                Arguments.of("", "", -1),
                // (C1-b3, C2-b3, C3-b1, C4-b2)
                Arguments.of("ab", "cde", -1),
                // (C1-b3, C2-b3, C3-b3, C4-b3)
                Arguments.of("Anita lava la tina", "lava", 6),
                // (C1-b3, C2-b3, C3-b2, C4-b3)
                Arguments.of("Ana lava lana", "Ana lava lana", 0),
                // (C1-b3, C2-b3, C3-b2, C4-b1)
                Arguments.of("Ana lava lana", "Ana lava lana ", 0),
                // (C1-b3, C2-b2, C3-b3, C4-b2)
                Arguments.of("somos o no somos", "", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("nullPatternsProviders")
    void testPatternIndexThrowsExceptionWhenInputIsNull(String subject, String pattern) {
        assertThrows(IllegalArgumentException.class, () -> PatternIndex.patternIndex(subject, pattern));
    }

    private static Stream<Arguments> nullPatternsProviders() {
        return Stream.of(
                // (C1-b1, C2-b2, C3-b2, C4-b4)
                Arguments.of(null, ""),
                // (C1-b2, C2-b1, C3-b3, C4-b4)
                Arguments.of("", null),
                // (C1-b1, C2-b1, C3-b2, C4-b4)
                Arguments.of(null, null),
                // (C1-b1, C2-b3, C3-b3, C4-b4)
                Arguments.of(null, "hola"),
                // (C1-b1, C2-b2, C3-b1, C4-b4)
                Arguments.of(null, "")
        );
    }
}