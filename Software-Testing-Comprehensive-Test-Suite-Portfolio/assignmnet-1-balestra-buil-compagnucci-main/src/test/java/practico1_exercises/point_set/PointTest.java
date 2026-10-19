package practico1_exercises.point_set;

import static org.hamcrest.MatcherAssert.assertThat; 

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.*;


class PointTest {

    @Test
    void test_swap() {
        // arrange
	    Point p = new Point(3,4);

        // act
	    p.swap();

        // assert
        assertAll("swapping is wrong", () -> {
            assertThat(p.getX(), is(4.0F));
            assertThat(p.getY(), is(3.0F));
        });
    }

    @Test
    void test_default_constructor() {
        // arrange
        Point point = new Point();

        // act

        // assert
        assertAll(() -> {
            assertEquals(point.getX(), 0, "Default x value should be 0");
            assertEquals(point.getY(), 0, "Default y value should be 0");
        });
    }

    
    @ParameterizedTest
    @MethodSource("pointCoordinatesProvider")
    void test_class_constructor(float x, float y) {
        // arrange
        Point point = new Point(x, y);

        // act

        // assert
        assertAll(() -> {
            assertEquals(point.getX(), x);
            assertEquals(point.getY(), y);
        });
    }

    private static Stream<Arguments> pointCoordinatesProvider() {
        return Stream.of(
            Arguments.of(1, 3.3F), 
            Arguments.of(4.5F, 0.2F),
            Arguments.of(-23, 0)
        );
    }

    @Test
    void test_setX() {
        // arrange
        Point point = new Point();

        // act
        point.setX(9.01F);

        // assert
        assertEquals(point.getX(), 9.01F, "x value should be 9.");
    }

    @Test
    void test_setY() {
        // arrange
        Point point = new Point();

        // act
        point.setY(5.0F);

        // assert
        assertEquals(point.getY(), 5.0F, "y value should be 5.0");
    }

    @Test
    void testDistanceTo() {
        // arrange
        Point point1 = new Point(1.0f, 2.0f);
        Point point2 = new Point(4.0f, 6.0f);

        // act
        Double result = point1.distanceTo(point2);

        // assert
        assertEquals(5.0, result, "Distance should be 5.0");
    }

    @ParameterizedTest
    @MethodSource("pointsProvider") 
    void testEquals(Point point1, Point point2, boolean expectedResult) {
        // arrange

        // act

        // assert
        assertEquals(point1.equals(point2), expectedResult);
    }

    private static Stream<Arguments> pointsProvider() {
        return Stream.of(
            Arguments.of(new Point(0.8F, 1.2F), new Point(0.8F, 1.2F), true), 
            Arguments.of(new Point(6.3F, 4.5F), new Point(0.0F, 7.3F), false),
            Arguments.of(new Point(2.0F, 2.0F), new Point(-2.0F, 2.0F), false)
        );
    }
}