package practico1_exercises.color_points;

//Introduction to Software Testing
//Authors: Paul Ammann & Jeff Offutt
//Chapter 1; page ??
//See PointTest.java for JUnit tests
//See also ColorPoint.java

public class Point {
	private int x; private int y;

	public Point(int x, int y) { 
		this.x=x; 
		this.y=y; 
	} 
	
	@Override public boolean equals(Object o) { 
	   if (!(o instanceof Point)) 
		   return false;
	   Point p = (Point) o;
	   return (p.x == this.x) && (p.y == this.y);
	}
}