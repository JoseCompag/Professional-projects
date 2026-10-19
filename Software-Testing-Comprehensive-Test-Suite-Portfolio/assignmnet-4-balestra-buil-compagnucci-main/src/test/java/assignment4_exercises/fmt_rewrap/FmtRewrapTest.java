package assignment4_exercises.fmt_rewrap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FmtRewrapTest {

    @Test
    public void testFmtRewrap_EmptyString() {
        // Test path covered: [1, 2, 21]
        String result = FmtRewrap.fmtRewrap("", 0);

        assertEquals("\n", result, "Empty string should return a single newline character");
    }

    @ParameterizedTest
    @MethodSource("nodeCoverageProviders")
    void testFmtRewrapNodeCoverage(String s, int n, String expected) {
        String result = FmtRewrap.fmtRewrap(s, n);

        assertEquals(expected, result, "Node coverage test failed for input: '" + s + "' and line width: " + n);
    }

    private static Stream<Arguments> nodeCoverageProviders() {
        return Stream.of(
                Arguments.of("Hello world", 6, "Hello\nworld\n"),
                Arguments.of("\nHello world", 10, " Hello\nworld\n"),
                Arguments.of(" Hello World", 8, " Hello\nWorld\n"),
                Arguments.of("Hello\n\nHello?", 10, "Hello\n\nHello?\n"));
    }

    @ParameterizedTest
    @MethodSource("edgeCoverageProviders")
    void testFmtRewrapEdgeCoverage(String s, int n, String expected) {
        String result = FmtRewrap.fmtRewrap(s, n);

        assertEquals(expected, result, "Edge coverage test failed for input: '" + s + "' and line width: " + n);
    }

    private static Stream<Arguments> edgeCoverageProviders() {
        return Stream.of(
                // Test path covered: [1,2,3,4,5,11,15,16,20,2,21]
                Arguments.of("This", 0, "This\n"),

                // Test paths covered: [1,2,3,4,5,11,12,20,2,21] [1,2,3,4,5,11,13,20,2,21]
                Arguments.of("This is", 0, "This\nis\n"),

                // Tests path covered: [1,2,3,4,5,11,14,18,19,20,2,21]
                Arguments.of("\nThis is", 0, " This\nis\n"),

                // Tests path covered: [1,2,3,4,5,11,14,17,19,20,2,21]
                Arguments.of("\n\nThis is", 0, "\n\nThis\nis\n"));
    }

    @ParameterizedTest
    @MethodSource("primePathCoverageProviders")
    void testFmtRewrapPrimePathCoverage(String s, int n, String expected) {
        String result = FmtRewrap.fmtRewrap(s, n);

        assertEquals(expected, result, "Prime path coverage test failed for input: '" + s + "' and line width: " + n);
    }

    private static Stream<Arguments> primePathCoverageProviders() {
        return Stream.of(
                // Test path covered: [1,2,21]
                Arguments.of("", 0, "\n"),

                // Test path covered: [1,2,3,4,5,11,15,16,20,2,21]
                Arguments.of("This", 0, "This\n"),

                // Test paths covered: [1,2,3,4,5,11,12,20,2,21] [1,2,3,4,5,11,13,20,2,21]
                Arguments.of("This is", 0, "This\nis\n"),

                // Tests path covered: [1,2,3,4,5,11,14,18,19,20,2,21]
                Arguments.of("\nThis is", 0, " This\nis\n"),

                // Tests path covered: [1,2,3,4,5,11,14,17,19,20,2,21]
                Arguments.of("\n\nThis is", 0, "\n\nThis\nis\n"),

                // Tests path covered: [1,2,3,4,5,11,13,20,2,3,4,6,8,9,11,12,20,2,21]	
                Arguments.of("Este es un ejemplo de string largo", 20, "Este es un ejemplo\nde string largo\n")
        );
    }
}