package com.java.search;

public class BinarySearch {
	/*
	 * It works only on sorted array
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int key = 7;
		int index = searchByBinarySearch(arr, key, 0, arr.length);
		System.out.println("found at index: "+index);
	}
	
	private static int searchByBinarySearch(int[] arr, int key, int left, int right){
		int mid = left + (right-left)/2;
		if(arr[mid] == key)
			return mid+1;
		
		if(key>arr[mid])
			return searchByBinarySearch(arr, key, mid+1, right);
		else
			return searchByBinarySearch(arr, key, left, mid-1);
		//return 0;
	}
}
