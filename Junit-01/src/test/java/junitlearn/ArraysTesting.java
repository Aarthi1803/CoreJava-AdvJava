package junitlearn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void testArrays() {
		int expected[] = {2,4,6,8};
		int actual [] = {4,8,6,2};
//		assertArrayEquals(expected, actual); // org.opentest4j.AssertionFailedError: array contents differ at index [0], expected: <2> but was: <4>
		Arrays.sort(actual); //2,4,6,8
//		assertArrayEquals(expected, actual);
//		assertEquals(expected, actual); // org.opentest4j.AssertionFailedError: expected: [I@3b2da18f<[2, 4, 6, 8]> but was: [I@5906ebcb<[2, 4, 6, 8]>
//		Here it is checking reference array variables not data inside array variables. To compare elements insider array use assertArrayEquals only.
//		int expected1[] = {2,4,6,8};
		String expected1 [] = {"Aarthi", "Isha", "Hema", "Pavi" };
		String actual1 [] = {"Aarthi", "Isha", "Hema", "Pavi" };
		assertArrayEquals(expected1, actual1); // The method assertArrayEquals(int[], int[]) in the type Assertions is not applicable for the arguments (int[], String[])
	}

}
