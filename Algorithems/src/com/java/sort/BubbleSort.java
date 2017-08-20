package com.java.sort;

public class BubbleSort {
	
	
	/*
	 * BUBBLE SORT Pseudocode
	 * func bubblesort( var a as array )
    	for i from 1 to N
        for j from 0 to N - 1
           if a[j] > a[j + 1]
              swap( a[j], a[j + 1] )
		end func
		
		Time Complexity:
		Best: O(n*n) 
		Worst:O(n*n) 
		Average:O(n*n)
		
		 Space Complexity: O(1)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9, 4, 3, 7};
		
		sortByBubbleSort(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("Output: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sortByBubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i; j++) // used arr.length - i to reduce number of iteration
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
