package junitlearn;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		Calc c = new Calc();
		int actualResult = c.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult, actualResult);
	}

}
