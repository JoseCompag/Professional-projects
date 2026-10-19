package assignment2_exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class SimpleRoutinesTest {

    int[] array;

    @ParameterizedTest
    @MethodSource("findLastNumbersProvider")
    public void test_findLast(int[] array, int findElement, int expectedResult) {
        this.array = array;
        int result = SimpleRoutines.findLast(array, findElement);
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

        int result = SimpleRoutines.lastZero(array);

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
    @CsvSource({
        "'[]', 0",
        "'[1,2,3,4]', 4",
        "'[1,2,3,4,0]', 4",
    })
    public void test_countPositive(String arrayString, int expectedResult) {
        int[] array = StringParser.parseToStringArray(arrayString);
        this.array = array;
        int result = SimpleRoutines.countPositive(array);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "'[]', 0",
        "'[2,3,4,5]', 4",             
        "'[-3,-2,0,1,4]', 3"
    })
    public void test_OddOrPos(String arrayString, int expectedResult) {
        int[] array = StringParser.parseToStringArray(arrayString);
        this.array = array;
        int result = SimpleRoutines.oddOrPos(array);
        assertEquals(result, expectedResult);
    }
}