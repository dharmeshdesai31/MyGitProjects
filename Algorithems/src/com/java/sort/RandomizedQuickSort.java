package com.java.sort;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedQuickSort {

	/*
	 * IT IS SAME AS QUICK SORT,JUST WHILE FINDING PARTITION 
	 * WE NEED TO FIND RANDOM PIVOT POINT
	 * 
	 Quicksort(A as array, low as int, high as int){
    if (low < high){
        pivot_location = Partition(A,low,high)
        Quicksort(A,low, pivot_location)
        Quicksort(A, pivot_location + 1, high)
    }
    
	}
	Partition(A as array, low as int, high as int){
	     pivot = A[low]
	     leftwall = low
	
	     for i = low + 1 to high{
	         if (A[i] < pivot) then{
	             swap(A[i], A[leftwall])
	             leftwall = leftwall + 1
	         }
	     }
	     swap(pivot,A[leftwall])
	    return (leftwall)}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 9, 4, 3, 7};
		sortByRandomizeQuickSort(arr);
		printArray(arr);
	}

	private static void printArray(int []arr){
			
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
	}

	public static void sortByRandomizeQuickSort(int[] arr){
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low, high);
	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		printArray(arr);
		if(low < high){
			int partition = partition(arr, low, high);
			quickSort(arr, low, partition-1);
			quickSort(arr, partition+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int rand = ThreadLocalRandom.current().nextInt(low, high + 1);
		//System.out.println("P: "+rand);
		swap(arr, rand, high);
		int pivot = arr[high];
		//int lowerWall = low-1;
		int i=low-1;
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot){
				i++;
				swap(arr, j, i);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
	}
	
	private static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
