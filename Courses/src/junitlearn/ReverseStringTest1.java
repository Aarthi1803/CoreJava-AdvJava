package junitlearn;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Junit5
class ReverseStringTest1 {

	@Test
	void test() {
		ReverseString rs = new ReverseString();
		assertEquals("avaJ", ReverseString.reverseString("Java"));
		assertEquals("neilA", ReverseString.reverseString("Alien"));
		assertEquals("neilA", ReverseString.reverseString("lien"));
	}

}
