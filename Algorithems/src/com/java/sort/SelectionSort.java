package com.java.sort;

public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudocode
		 *  1: Find the smallest card. Swap it with the first card.
			2: Find the second-smallest card. Swap it with the second card.
			3: Find the third-smallest card. Swap it with the third card.
			4: Repeat finding the next-smallest card, and swapping it into the 
			   correct position until the array is sorted.
		 */
		/*
		 * Time complexity
		 * best = O(n*n) worst: O(n*n) average:O(n*n)
		 * 
		 * Space Complexity
		 * O(1)
		 */
		int arr[] = {5, 9, 4, 3, 7};
		sortBySelectionSort(arr);
		printArray(arr);
	}
	
	private static void printArray(int []arr){
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sortBySelectionSort(int[] arr)
	{
		int key = 0;
		for(int i=0; i<arr.length-1; i++){
			key = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[key] > arr[j]){
					key = j;
				}
			}
			if(i != key){
				//write swapping logic
				swap(arr, i, key);
			}
			printArray(arr);
		}
	}
	
	private static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
