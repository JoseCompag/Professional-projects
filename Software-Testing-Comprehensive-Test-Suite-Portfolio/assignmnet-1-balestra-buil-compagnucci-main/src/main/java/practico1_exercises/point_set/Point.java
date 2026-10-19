package practico1_exercises.point_set;

/**
 * Clase Point representa un punto en el plano, caracterizado por sus coordenadas
 * x e y. 
 */
public class Point {

	private float x; // coordenada x del punto
	private float y; // coordenada y del punto
	
	/**
	 * Constructor por defecto. Genera un punto en la interseccion entre los ejes
	 * de x e y.
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * Constructor de la clase, que toma como parametros los valores para la 
	 * inicializacion.
	 * @param x es el valor a utilizar para setear la primera coordenada del punto
	 * @param y es el valor a utilizar para setear la segunda coordenda del punto.
	 */
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return el valor de la primera coordenada del punto.
	 */
	public float getX() {
		return x;
	}

	/**
	 * @return el valor de la segunda coordenada del punto.
	 */	
	public float getY() {
		return y;

	}

	/**
	 * Cambia el valor de la primera coordenada del punto
	 * @param x es el valor con el cual setear la primera coordenada del punto
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Cambia el valor de la segunda coordenada del punto
	 * @param x es el valor con el cual setear la segunda coordenada del punto
	 */
	//TODO:error aca
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Intercambia los valores de la primera y segunda coordenadas del punto.
	 */
	// TODO: error aca
	public void swap() {
		float aux = x;
		x = y;
		y = aux;
		/* x = x+y;
		y = x-y;
		x = x+y; */ //inject bug (+ instead of -)
	}
	
	/**
	 *@precondition other!=null 
	 *@param other el punto al cual se debe calcular la distancia
	 *@return la distancia desde el punto this al punto other
	 */
	// TODO: error aca
	public Double distanceTo(Point other) {
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2) );
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
	}

	/*
 	Corrección: Falta definir  el método hashCode()
	*/
}
