package com.java.sort;

public class ModifyedBubbleSort {

	/*
	 * It is similler to bubble sort but we just keeps track that if the element is 
	 * swapped or not, if not then list is already sorted
	 */
	/*
	 * MODIFYED BUBBLE SORT Pseudocode
	
		Time Complexity:
		Best: O(n) 
		Worst:O(n*n) 
		Average:O(n*n)
		
		 Space Complexity: O(1)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9, 4, 3, 7};
		/*
		int[] arr = {2, 1, 3, 4, 5};
		in the above case outer for loop gose only once,
		then from nest time other elements are already sorted
		so isSwapped = false, hence outer for loop breaks
		*/
		sortByModifyedBubbleSort(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("Output (modifyed Bubble sort): ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sortByModifyedBubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		boolean isSwapped= true;
		for(int i=1; (i<arr.length && isSwapped); i++)
		{
			isSwapped = false;
			for(int j=0; j<arr.length-i; j++) // used arr.length - i to reduce number of iteration
			{
				if(arr[j] > arr[j+1])
				{
					isSwapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void swap(int[] arr, int firstIndex, int secondIndex)
	{
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
}
