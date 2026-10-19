package practico1_exercises.point_set;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class PointSetTest {

	private PointSet set;
   	
		@BeforeEach
		public void setUp() {
	    	
	    	set = new PointSet();
	    	
	    	Point p1 = new Point(2,3);
	    	Point p2 = new Point(1,6);
	    	Point p3 = new Point(4,5);
	    	Point p5 = new Point(1,4);
	    	Point p6 = new Point(-1,4);

	    	set.addPoint(p1);
				set.addPoint(p2);
	      set.addPoint(p3);
	      set.addPoint(p5);
	      set.addPoint(p6);
	       	
	    }
		
		
		@Test
	  	public void test01() {
			//arrange
			Pair<Point, Point> p = set.closest();

			//act

			//assert
			assertThat("The closest points should be different", p.getFst().distanceTo(p.getSnd()),greaterThan(0.0));
	  	}
	    
		@Test
	  	public void test02() {
				//arrange
	    	Point p4 = new Point(1,6);

				//act
				int sizeBefore = set.size();
				set.addPoint(p4);
				int sizeAfter= set.size();

				//assert
				assertThat("Adding an already existing point does not change the set size", sizeBefore,equalTo(sizeAfter));
	  	}

			@Test
			public void test03() {
				//arrange
				Point p5 = new Point(4,5);

				//act
				boolean found = set.contains(p5);

				//assert
				assertThat("The point should be found", found,equalTo(true));
			}

			@Test
			public void test04() {
				//arrange
				Point p5 = new Point(5,5);

				//act
				int sizeBefore = set.size();
				set.addPoint(p5);
				int sizeAfter= set.size();

				//assert
				assertThat("Adding a point that does not exist changes the size of the set", sizeAfter,equalTo(sizeBefore+1));
			}

			@Test
			public void test05() {
				//arrange
				Point[] arrayExpected = new Point[5];
				arrayExpected[0] = new Point(-1,4);
				arrayExpected[1] = new Point(1,4);
				arrayExpected[2] = new Point(1,6);
				arrayExpected[3] = new Point(2,3);
				arrayExpected[4] = new Point(4,5);

				//act
				Point[] array = set.sort();

				//assert
				assertThat("The sorted array should be the same", arrayExpected,equalTo(array));

			}


		
	  
}
