/**
 * 
 */

/**
 * @author Student
 *
 */
public class CircleDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(3);
		
		System.out.println(circle1); // prints out a reference to the memory using a default "toString" method
		System.out.println(circle2); // we overrided the default method

		// Start at 1 because a circle has to have a radius of at least 1
		for (int i = 1; i <= 1000; i++) {
			System.out.println(new Circle(i));
			/*
			 * Can also do this:
			 * Circle circle = new Circle(i);
			 * System.out.println(circle);
			 */
		}
	}

}
