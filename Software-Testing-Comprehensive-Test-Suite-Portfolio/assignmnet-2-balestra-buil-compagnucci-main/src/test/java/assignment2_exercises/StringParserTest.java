package assignment2_exercises;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Collections;
import java.util.List;

public class StringParserTest {
    
    @ParameterizedTest
    @MethodSource("stringArrayProvider")
    public void positiveTestParseStringArray(String string, int[] expectedResult) {
        assertArrayEquals(StringParser.parseToStringArray(string), expectedResult);
    }

    private static Stream<Arguments> stringArrayProvider() {
        return Stream.of(
            Arguments.of("[1,2,3,4]", new int[]{1, 2, 3, 4}),
            Arguments.of("[0,-1,45,12345]", new int[]{0,-1,45,12345}),
            Arguments.of("[-1]", new int[]{-1}),
            Arguments.of("[]", new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("invalidInputStringArrayProvider")
    public void neativeTestParseStringArray(String string) {
        Exception exceptionThrown = assertThrows(NumberFormatException.class, () -> {
            StringParser.parseToStringArray(string);
        });
    }

    private static Stream<Arguments> invalidInputStringArrayProvider() {
        return Stream.of(
            Arguments.of("[1.0,1,2,3]"),
            Arguments.of("[-3.2,8,30]"),
            Arguments.of("[a,b,1n]"),
            Arguments.of("[null]"),
            Arguments.of("[9,hello,20,-8]")
        );
    }

    @ParameterizedTest
    @MethodSource("stringListProvider")
    public void positiveTestParseStringList(String array, List<Comparable> expectedResult) {
        assertEquals(StringParser.parseToStringList(array), expectedResult);
    }

    private static Stream<Arguments> stringListProvider() {
        return Stream.of(
            Arguments.of("[]", Collections.emptyList()),
            Arguments.of("[1,2,3,4]", List.of(1, 2, 3, 4)),
            Arguments.of("[1.1,2.2,3.3]", List.of(1.1, 2.2, 3.3)),
            Arguments.of("[1.1f,2.2f,3.3f]", List.of(1.1, 2.2, 3.3)),
            Arguments.of("[Hello,World]", List.of("Hello", "World")),
            Arguments.of("[a,b,z]", List.of("a", "b", "z"))
        );
    }

    @ParameterizedTest
    @MethodSource("invalidStringListProvider")
    public void testParseToStringList_InvalidInputs(String string, Class<RuntimeException> expectedExceptionClass) {
        Exception exceptionThrown = assertThrows(expectedExceptionClass, () -> {
            StringParser.parseToStringList(string);
        });
    }

    private static Stream<Arguments> invalidStringListProvider() {
        return Stream.of(
            Arguments.of("", StringIndexOutOfBoundsException.class),
            Arguments.of(null, NullPointerException.class)
        );
    }
}