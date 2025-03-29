package junitlearn;

import static org.junit.Assert.*;

import org.junit.Test;

//Junit4
public class ReverseStringTest {

//	@Test(timeout=1)
	@Test
	public void test() {
		ReverseString rs = new ReverseString();
//		String actualResult = ReverseString.reverseString("Java");
//		String expectedResult = "avaJ";
//		assertEquals(expectedResult, actualResult);
		
		assertEquals("avaJ", ReverseString.reverseString("Java"));
	}

}
