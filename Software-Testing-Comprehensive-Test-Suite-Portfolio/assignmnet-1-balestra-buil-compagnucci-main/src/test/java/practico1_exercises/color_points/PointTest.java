package practico1_exercises.color_points;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import practico1_exercises.color_points.Color;
import practico1_exercises.color_points.ColorPoint;
import practico1_exercises.color_points.Point;


public class PointTest {
	private static Point p; 
	private static ColorPoint cpr;  
	private static ColorPoint cpb;   
	
	/**
	 * @throws java.lang.Exception
	 */
	
	@BeforeAll
	public static  void setUp() throws Exception {
		p = new Point(1,2);
		cpr = new ColorPoint(1,2,Color.RED);
		cpb = new ColorPoint(1,2,Color.BLUE);
	}
	
	@Test
	public void test_equality_point_to_colorPoint() {
	   assertTrue(p.equals(cpr), "Point is not equals to ColorPoint");
	}
	
	// this test fails!
	@Test public void test_equality_colorPoint_to_point() {
		assertTrue(cpr.equals(p), "ColorPoint is not equals to Point");
	}

	// this test fails!
	@Test public void test_symmetry() {
		assertEquals(p.equals(cpr), cpr.equals(p), "equality symmetry broken");
	}
	
	@Test public void  test_equality () {
		assertFalse(cpr.equals(cpb), "red and black color points should not be equals");
	}

	// this test passes
	@Test public void transitivity() {
		assumeTrue(cpr.equals(p) && p.equals(cpb));

		assertTrue(cpr.equals(cpb), "equality transitivity broken");
//		if (cpr.equals(p) && p.equals(cpb)) {
//		      assertTrue(cpr.equals(cpb));
//		}
	}

	@Test
	public void test_does_not_execute_the_fault() {
		Point p1 = new Point(1, 2);

		assertTrue(p.equals(p1), "Points with same coordinates should be equal");
	}

	@Test
	public void test_does_execute_the_fault_but_not_error() {
		ColorPoint p1 = new ColorPoint(1, 2, Color.BLUE);

		assertTrue(cpb.equals(p1), "ColorPoints with same coordinates and color should be equal");
	}

	@Test
	public void test_error_but_not_failure() {
		assertFalse(cpb.equals(null), "ColorPoint should not be equal to null");
	}
}