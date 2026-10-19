package practico1_exercises.simple_routines;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleRoutinesTest {

    @Test
    public void test_findLastWithEmptyArray() {
        int[] array = {};

        int result = SimpleRoutines.findLast(array, 1);

        assertEquals(-1, result, "Array is empty therefore it not contains the find element, -1 is expected");
    }

    @Test
    public void test_findLastWithElementPresent() {
        int[] array = {2, 3, 5};

        int result = SimpleRoutines.findLast(array, 3);

        assertEquals(1, result, "Array doesn't contain the searched element");
    }

    @Test
    public void test_findLastWithFirstElement() {
        int[] array = {2, 3, 5};

        int result = SimpleRoutines.findLast(array, 2);

        assertNotEquals(0, result, "Array doesn't contain the searched element");
    }


    @Test
    public void test_lastZeroWithEmptyArray() {
        int[] array = {};

        int result = SimpleRoutines.lastZero(array);

        assertEquals(-1, result, "Array is empty therefore it contains no zeros, -1 is expected.");
    }

    @Test
    public void test_lastZeroWithLastElementAsZero() {
        int[] array = {1, 2, 0};

        int result = SimpleRoutines.lastZero(array);

        assertEquals(2, result, "Last element is a zero, should return index 2.");
    }

    @Test
    public void test_LastZeroWithFirstElementAsZero() {
        int[] array = {0, 1, 0};

        int result = SimpleRoutines.lastZero(array);

        assertNotEquals(2, result, "First and last elements are a zero, expected index is not returned.");
    }

    @Test
    public void test_countPositiveWithEmptyArray() {
        int[] array = {};

        int result = SimpleRoutines.countPositive(array);

        assertEquals(0, result, "Array is empty therefore it contains no positive numbers, 0 is expected.");
    }

    @Test
    public void test_countPositiveWithAllPositiveNumbers() {
        int[] array = {1, 2, 3, 4};

        int result = SimpleRoutines.countPositive(array);

        assertEquals(4, result, "Array contains 4 positive numbers, 4 is expected.");
    }

    @Test
    public void test_countPositive_withFourPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 0};

        int result = SimpleRoutines.countPositive(array);

        assertNotEquals(4, result, "Expected the count of positive numbers to be 4, but it was not.");
    }

    @Test
    public void test_OddOrPosWithEmptyArray() {
        int[] array = {};

        int result = SimpleRoutines.oddOrPos(array);

        assertEquals(0, result, "Array is empty, amount of odd and positive numbers should be 0.");
    }

    @Test
    public void test_OddOrPosWithArrayOfPositives() {
        int[] array = {2,3,4,5};

        int result = SimpleRoutines.oddOrPos(array);

        assertEquals(4, result, "All numbers are positives, 4 is expected.");
    }

    @Test
    public void test_OddOrPosWithArrayOfPositivesAndNegatives() {
        int[] array = {-3, -2, 0, 1, 4};

        int result = SimpleRoutines.oddOrPos(array);

        assertNotEquals(3, result, "The count of positive and odd numbers should be 3.");
    }
}