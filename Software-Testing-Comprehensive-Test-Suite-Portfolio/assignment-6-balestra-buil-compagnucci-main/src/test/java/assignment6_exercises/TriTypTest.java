package assignment6_exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import assignment6_exercises.TriTyp;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TriTypTest {

	@ParameterizedTest
	@MethodSource("trianglesProvider")
	public void test(int side1, int side2, int side3, int expected) {
		int result = TriTyp.triang(side1, side2, side3);
		assertEquals(expected, result, "Expected: " + expected + " but got: " + result);
	}

	private static Stream<Arguments> trianglesProvider(){
		return Stream.of(
				// Equilateral
				Arguments.of(3, 3, 3, 3),
				// Isosceles
				Arguments.of(3, 3, 2, 2),
				Arguments.of(3, 2, 3, 2),
				Arguments.of(2, 3, 3, 2),
				// Scalene
				Arguments.of(3, 4, 5, 1),
				Arguments.of(4, 3, 5, 1),
				Arguments.of(3, 5, 4, 1),
				// Not a triangle
				Arguments.of(1, 2, 3, 4),
				Arguments.of(1, 3, 2, 4),
				Arguments.of(3, 1, 2, 4),
				Arguments.of(5, 5, 10, 4),
				Arguments.of(5, 10, 5, 4),
				Arguments.of(10, 5, 5, 4),
				// Side negative or zero
				Arguments.of(0, 0, 0, 4),
				Arguments.of(0, 1, 1, 4),
				Arguments.of(1, 0, 1, 4),
				Arguments.of(1, 1, 0, 4),
				Arguments.of(-1, 1, 1, 4),
				Arguments.of(1, -1, 1, 4),
				Arguments.of(1, 1, -1, 4),
				Arguments.of(-1, -1, -1, 4),
				// Borderline case
				Arguments.of(1, 1, 1, 3),
				Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3)
		);
	}

}
