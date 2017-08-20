package com.java.sort;

public class InsertionSort {
	/*
		INSERTION-SORT
		1 for j = 2 to A:length
			2 key = A[j]
			3 
			4 i = j - 1
			5 while i > 0 and A[i] > key
				6 A[i+1] = a[i]
				7 i --
			8 A[i+1] = key
	 */
	/*
	 * Time complexity
	 * best: O(n) worst: O(n*n) average: O(n*n)
	 * 
	 * Space Complexity
	 * O(n)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5, 2, 4, 6, 1, 3};
		printArray(arr);
		sortByInsertionSort(arr);
		
	}
	
	private static void printArray(int []arr){
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sortByInsertionSort(int[] arr)
	{
		int key, index =0;
		for(int j=1; j<arr.length; j++){
			key = arr[j];
			index = j-1;
			while(index >= 0 && arr[index] > key){
				arr[index+1] = arr[index];
				index--;
			}
			arr[index+1] = key;
			printArray(arr);
		}
		
	}
	
	private static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
