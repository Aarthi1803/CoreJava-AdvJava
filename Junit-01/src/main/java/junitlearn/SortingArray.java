package junitlearn;

import java.util.Arrays;

public class SortingArray {
	public int[] sortingArray(int array[]){
//		Arrays.sort(array);
//		return array;
		
		for(int i=0; i<10_00_000; i++)
		{
			Arrays.sort(array);
		}
		return array;
	}
}
