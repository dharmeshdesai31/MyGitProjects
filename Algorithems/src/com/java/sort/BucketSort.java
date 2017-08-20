package com.java.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

	/*
	 * Bucket sort can be used for distributed sorting – 
	 * each bucket can be ordered by a different thread or 
	 * even by a different computer. Another use case is a sorting 
	 * of huge input data, which cannot be loaded into the main 
	 * memory by an ordinary O(n\\cdot \\log(n)) algorithm.
	 */
	public static void main(String[] args) {
		int[] arr = {5, 9, 4, 3, 7};
		sortByBucketSort(arr, 5);
		printArray(arr);
	}

	private static void printArray(int []arr){		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void sortByBucketSort(int[] arr, int bucketCount) {
		if (arr.length <= 1) 
			return;
		
		int high = arr[0];
		int low = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < low ) low = arr[i];
			if(arr[i] > high) high = arr[i];
		}
		
		double interval = ((double) (high - low + 1))/bucketCount;
		ArrayList<Integer> buckets[] = new ArrayList[bucketCount];
		for(int i=0; i<bucketCount; i++)
			buckets[i] = new ArrayList();
		
		//partition the input
		for(int i=0; i<arr.length; i++)
		{
			buckets[(int)((arr[i] - low)/interval)].add(arr[i]);
		}
		
		int pointer=0;
		for(int i=0; i<buckets.length; i++)
		{
			Collections.sort(buckets[i]);
			for(int j=0; j<buckets[i].size(); j++)
			{
				arr[pointer] = buckets[i].get(j);
				pointer++;
			}
		}
	}

}
