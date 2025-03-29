package junitlearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();
	@Test
	void testcomputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testcomputeCircleArea() {
		assertEquals(76.5, shape.computeCircleArea(5), "Area of circle calculation is wrong");
		//Directly we are passing string message and asserEquals evaluates that. If test is passing message object is evaluated but not showing in output.
		//If fails we can see string message
	}
	
	@Test
	void testcomputeCircleArea_Supplier() {
		assertEquals(78.5, shape.computeCircleArea(5),()-> "Area of circle calculation is wrong");
		//Here using supplier interface this string message gets executed and evaluated only if test case fails.
		//If pass this string message will not be evaluated and not considered. Only if fail evaluation happens.
	}
}
