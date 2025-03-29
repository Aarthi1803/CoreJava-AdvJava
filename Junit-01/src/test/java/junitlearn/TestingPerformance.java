package junitlearn;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		SortingArray array = new SortingArray();
		int unsorted[] = {2,5,1};
		//invoking sort method of 10 lakh times should be finished within 10 milliseconds. If it is not able to do within time, test case would fail.
		//If able to finish invoking sort method of 10 lakh times within 10 milliseconds then test case would pass
//		assertTimeout(Duration.ofMillis(10), ()->array.sortingArray(unsorted)); //Test case failed as sorting 10 lakh times cannot be done within 10 milliseconds
//		Run time error : org.opentest4j.AssertionFailedError: execution exceeded timeout of 10 ms by 10 ms
		assertTimeout(Duration.ofMillis(100), ()->array.sortingArray(unsorted)); //Test case passed as sorting 10 lakh times can be done within 100 milliseconds
//		In Junit 5 Jupiter - assertTimeout - check performance of particular unit to complete its task.		
//		In Junit 4 we use annotation - @Test(timeout=100) above method name.
	}

}
