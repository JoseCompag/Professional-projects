package practico1_exercises.simple_routines;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SimpleFixedRoutinesTest {
    int[] array;

    @ParameterizedTest
    @MethodSource("findLastNumbersProvider")
    public void test_findLast(int[] array, int findElement, int expectedResult) {
        this.array = array;

        int result = SimpleFixedRoutines.findLast(array, findElement);

        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> findLastNumbersProvider() {
        return Stream.of(
            Arguments.of(new int[]{}, 1, -1), 
            Arguments.of(new int[]{2, 3, 5}, 3, 1),
            Arguments.of(new int[]{2, 3, 5}, 2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("lastZeroNumbersProvider")
    public void test_lastZero(int[] array, int expectedResult) {
        this.array = array;

        int result = SimpleFixedRoutines.lastZero(array);

        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> lastZeroNumbersProvider() {
        return Stream.of(
            Arguments.of(new int[]{}, -1), 
            Arguments.of(new int[]{1, 2, 0}, 2),
            Arguments.of(new int[]{0, 1, 0}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("positiveAndNegativeNumbersArrayProvider")
    public void test_countPositive(int[] array, int expectedResult) {
        this.array = array;
        int result = SimpleFixedRoutines.countPositive(array);

        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> positiveAndNegativeNumbersArrayProvider() {
        return Stream.of(
            Arguments.of(new int[]{}, 0),
            Arguments.of(new int[]{1, 2, 3, 4}, 4),     
            Arguments.of(new int[]{1, 2, 3, 4, 0}, 4),
            Arguments.of(new int[]{0, -1, -2}, 0),
            Arguments.of(new int[]{-4, 2, 0, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("oddAndPositiveNumbersArrayProvider")
    public void test_OddOrPos(int[] array, int expectedResult) {
        this.array = array;
        int result = SimpleFixedRoutines.oddOrPos(array);

        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> oddAndPositiveNumbersArrayProvider() {
        return Stream.of(
            Arguments.of(new int[]{-3, -2, 0, 1, 4}, 3),
            Arguments.of(new int[]{2,3,4,5}, 4),
            Arguments.of(new int[]{}, 0),
            Arguments.of(new int[]{0, 2, 4}, 2),     
            Arguments.of(new int[]{-5, -3, -1}, 3),
            Arguments.of(new int[]{2, 4, 6, 8}, 4), 
            Arguments.of(new int[]{0, -1, -2}, 1)
        );
    }
}