package junitlearn;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() {
//		try {
		SortingArray array = new SortingArray();
//		int unsorted[] = {2,1,4};
//		int unsorted[] = null;
//		int sortedArray[] = array.sortingArray(unsorted);
//		for (int elem : sortedArray)
//			System.out.print(elem + " ");
//		fail(); //explicitly failing test case as there is no exception
//		}
//		catch(NullPointerException e) {
//			System.out.println("Null Pointer Exception is generated");
//			//Test case pass because exception is generated in catch block
//		}
//		If exception is not generated test case should fail or else if exception is generated test case should pass
		
//		int unsorted[] = {2,1,4}; // My expected output - NullPointer.class is not matching with actual output - array values --> 2,1,4. So test case fail.
		int unsorted[] = null; // My expected output - NullPointer.class is matching with actual output - array values null. So test case pass.
		assertThrows(NullPointerException.class,()->array.sortingArray(unsorted));
	}

}
