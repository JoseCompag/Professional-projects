package practico1_exercises.color_points;

//Introduction to Software Testing
//Authors: Paul Ammann & Jeff Offutt
//Chapter 1; page ??
//See PointTest.java for JUnit tests
//See also Point.java

public class ColorPoint extends Point {
	
	private Color color;
	
	public ColorPoint(int x, int y, Color color) { 
	   super (x,y);
	   this.color=color; 
	} 
	
	@Override public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		if (!(o instanceof ColorPoint)) {
			return o.equals(this);
		}
		ColorPoint cp = (ColorPoint) o;
		return (super.equals(cp) &&  (cp.color == this.color));
	}
}

enum Color { RED, WHITE, BLUE }