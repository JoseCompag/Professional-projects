package practico1_exercises.point_set;

import java.util.HashSet;



 /*
 * PointSet implements a set of Point and some operation on it
 */


public class PointSet {
	
	/*
	 * holds a set of points
	 */
    private /*@ spec_public @*/ HashSet<Point>  set; 

    
    public PointSet() {
    	set= new HashSet<Point>();
    }
    
  //@requires p!=null;
  //@ ensures contains(p);
  //@ ensures \old(contains(p)) ==> size() == \old(size());
  //@ ensures \old(!contains(p))==>size() == \old(size())+1;
	// TODO: error aca
    public /*@ pure @*/ void addPoint(Point p) {
			if(p == null) throw new NullPointerException("The point is null");
			/* Corrección: el add del método set ya controla que no se inserten
   			elementos repetidos
      			*/
			if(!contains(p)) set.add(p);
    }
    
    
    //return the set size 
    public /*@ pure @*/ int size() {
    	return set.size();
    }
    
    
    //@requires p!=null;
    //@ensures \old(set).equals(set);
    //contains return true iff p belong to set
		// TODO: error aca
    public /*@ pure @*/ boolean contains(Point p) {
			if(p == null) throw new NullPointerException("The point is null");
			/* Corrección: el contains del método set ya realiza este trabajo
      			*/
			for(Point p1: set) {
				if(p.equals(p1)) {
					return true;
				}
			}

			return false;
    }
    
	/**
	* @return a sorted (by x) array  of points in increasing order.
	*/	
	public  Point[] sort() {
		Point[] array =this.toArray() ;
		
		for (int l = array.length-1; l>=0; l--) {
			for (int i = 0; i<l; i++) {
				if (array[i].getX()>array[i+1].getX()) {
					Point e = array[i];
					array[i] = array[i+1];
					array[i+1] = e;
				}
			}
		}
		return array;
	}
     
	@Override
	public String toString() {
		return "PointSet [set=" + set + "]";
	}
    
    
	
	/*
	 * @return the pair of points closest to each other
	 */
	public Pair<Point, Point> closest() {
		Point[] points = this.toArray();
		Pair<Point, Point> closestPair = new Pair<Point, Point>();
		Double minDist = Double.MAX_VALUE;
		for(int i = 0; i<points.length-1;i++) {
			for(int j = i+1; j<points.length;j++) {
				Double dist = points[i].distanceTo(points[j]);

				if(dist <= minDist) {
					minDist =dist;
					closestPair.setFst(points[i]);
					closestPair.setSnd(points[j]);
				}
			}
		}
		return closestPair;
	}	
	
	/*
	 * @return an array containing the elements of the set
	 */
	private Point[] toArray() {
		Point [] array =new Point[set.size()]; 
		int i =0;
		for (Point q: set) {
			array[i] =q;
			
			i++;
		}
		return array;
	}
	
	
       
}
