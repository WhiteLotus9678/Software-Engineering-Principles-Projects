import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * @author masont
 *
 */
public class CircleUnitTester {
	Circle circle, circle1, circle2, circle3;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Used for resources like database connections
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Return the resources used.
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		circle = new Circle(2.0);
		circle1 = new Circle(3.3);
		circle2 = new Circle(-1.1);
		circle3 = null;
	}
	
	@Test
	public void testNull() {
		assertNull(circle3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//return resources used in setUp
	}

	/**
	 * Test method for {@link Circle#Circle(double)}.
	 */
	@Test
	public void testCircleDouble() {
		assertNotNull(circle);
	}
	
	/**
	 * Test method for {@link Circle#Circle(double)}.
	 */
	@Test
	public void testCircleDoubleNull() {
		Circle circleNull = null; 
		assertNull(circleNull);
		
	}
	
	/**
	 * Test method for {@link Circle#getRadius()}.
	 */
	@Test
	public void testGetRadius() {
		assertEquals(circle.getRadius(), 2.0 , 0.05);
	}
	/**
	 * Test method for {@link Circle#getRadius()}.
	 */
	@Test
	public void testGetRadiusFail() {
		assertNotEquals(circle1.getRadius(), 2.0 , 0.05);
	}
	/**
	 * Test method for {@link Circle#setRadius(double)}.
	 */
	@Test
	public void testSetRadius() {
		circle.setRadius(3.2);
		assertEquals(circle.getRadius(), 3.2, 0.05); // last parameter is the rate of error
	}

	/**
	 * Test method for {@link Circle#circumference()}.
	 */
	@Test
	public void testCircumference() {
		assertEquals(circle.circumference(), 2.0*Math.PI*2, .001);
	}

	/**
	 * Test method for {@link Circle#circumference()}.
	 */
	@Test
	public void testCircumferenceFail() {
		assertNotEquals(circle.circumference(), 1.0*Math.PI*2, .001);
	}
	
	/**
	 * Test method for {@link Circle#area()}.
	 */
	@Test
	public void testArea() {
		assertEquals(circle.area(), Math.PI*2.0*2, .001);
	}

}
