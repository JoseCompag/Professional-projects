package assignment3_exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * This class contains JUnit tests for the SetUtils class.
 * The method under test is: intersection().
 * These tests are derived from an Input Domain Modeling (IDM) approach.
 * We have identified three key characteristics (C1, C2, C3) that help define
 * the input partitions and guide the creation of the tests:
 * | ID  | Características              | b1          | b2          | b3            | b4        | b5            | b6        |
 * |-----|----------------------------  |-------------|-----------  |-----------    |-------    |-------        |-------    |
 * | C1  | Validez de set1              | set1=null   | set1={}     | #set1>=1      |           |               |           |
 * | C2  | Validez de set2              | set2=null   | set2={}     | #set2>=1      |           |               |           |
 * | C3  | Relación entre set1 y set2   | set1 y set2 | set1 es     | set2 es       | set1 y    | set1 y set2   | alguno    |
 * |     |                              | representan | un          | un            | set2      | tienen        | de los    |
 * |     |                              | el mismo    | subconjunto | subconjunto   | no        | elementos en  | dos       |
 * |     |                              | conjunto    | de set2     | de set1       | tienen    | comun pero    | conjuntos |
 * |     |                              |             |             |               | elems en  | no son        | es null   |
 * |     |                              |             |             |               | común     | iguales, ni   |           |
 * |     |                              |             |             |               |           | uno es        |           |
 * |     |                              |             |             |               |           | subconj. del  |           |
 * |     |                              |             |             |               |           | otro          |           |
 * |     |                              |             |             |               |           |               |           |
 * The goal of these tests is to cover all the relevant combinations of these characteristics.
 */
class IntersectionTest {
    Set<Integer> result;

    /**
     * This parameterized test method covers various cases of the intersection of two sets.
     * The test cases are derived from the identified characteristics (C1, C2, C3) and their partitions.
     *
     * @param set1 The first set to be intersected.
     * @param set2 The second set to be intersected.
     * @param expected The expected result after performing the intersection of set1 and set2.
     */
    @ParameterizedTest
    @MethodSource("setsProviders")
    void testIntersectionBetweenTwoSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> expected) {
        result = SetUtils.intersection(set1, set2);
        assertEquals(expected, result);
    }

    /**
     * This method provides the sets for testing the intersection method.
     * Each test case corresponds to a different combination of C1, C2, and C3 characteristics.
     *
     * @return A stream of arguments for the parameterized test, each containing set1, set2, and the expected result.
     */
    private static Stream<Arguments> setsProviders() {
        return Stream.of(
                // Test case 1: set1 and set2 have one common element (C1-b3, C2-b3, C3-b5)
                Arguments.of(
                        new HashSet<>(List.of(1, 2, 3)),
                        new HashSet<>(List.of(4, 2, 5)),
                        new HashSet<>(List.of(2))
                ),
                // Test case 2: set1 is empty, set2 has elements (C1-b2, C2-b3, C3-b2)
                Arguments.of(
                        new HashSet<>(),
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 3: set1 has elements, set2 is empty (C1-b3, C2-b2, C3-b3)
                Arguments.of(
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(),
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 4: set1 is a subset of set2 (C1-b3, C2-b3, C3-b2)
                Arguments.of(
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(1, 2, 3)),
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 5: set2 is a subset of set1 (C1-b3, C2-b3, C3-b3)
                Arguments.of(
                        new HashSet<>(List.of(1, 2, 3)),
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 6: set1 and set2 are identical (C1-b3, C2-b3, C3-b1)
                Arguments.of(
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 7: set1 and set2 have no common elements (C1-b3, C2-b3, C3-b4)
                Arguments.of(
                        new HashSet<>(List.of(1, 2)),
                        new HashSet<>(List.of(3, 4)),
                        new HashSet<>()
                ),
                // Test case 8: both sets are empty (C1-b2, C2-b2, C3-b1)
                Arguments.of(
                        new HashSet<>(),
                        new HashSet<>(),
                        new HashSet<>()
                )
        );
    }

    /**
     * This parameterized test method checks for cases where one or both sets are null.
     * In these cases, the intersection method should throw a NullPointerException.
     *
     * @param set1 The first set to be intersected (could be null).
     * @param set2 The second set to be intersected (could be null).
     */
    @ParameterizedTest
    @MethodSource("nullSetsProvider")
    void testIntersection_shouldThrowExceptionWhenSomeOfSetsIsNull(Set<Integer> set1, Set<Integer> set2) {
        assertThrows(NullPointerException.class, () -> SetUtils.intersection(set1, set2));
    }

    /**
     * This method provides the sets for testing the intersection method when one or both sets are null.
     *
     * @return A stream of arguments for the parameterized test, each containing set1 and set2.
     */
    private static Stream<Arguments> nullSetsProvider() {
        return Stream.of(
                // Test case 1: set1 is null, set2 has elements
                Arguments.of(
                        null,
                        new HashSet<>(List.of(1, 2))
                ),
                // Test case 2: set1 has elements, set2 is null
                Arguments.of(
                        new HashSet<>(List.of(1, 2)),
                        null
                ),
                // Test case 3: both set1 and set2 are null
                Arguments.of(
                        null,
                        null
                )
        );
    }
}
