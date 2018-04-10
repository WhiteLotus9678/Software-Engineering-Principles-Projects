/**
 * 
 */

/**
 * @author Student
 *
 */
public class Circle {
	private double radius = 1.0;
	
	public Circle() {
		radius = 1.0;
	}
	
	/**
	 * @param radius
	 * 
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	
	/**
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double circumference() {
		return (2 * Math.PI * radius);
	}
	
	public double area() {
		return (Math.PI * radius * radius);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [radius=" + radius +
				", circumference()=" + circumference() +
				", area()=" + area() + "]";
	}
}
