package com.java.search;

public class LinerarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 9, 7, 8};
		int key = 7;
		int index = linearSearch(arr, key);
		System.out.println("found at index : "+index);
	}

	private static int linearSearch(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key)
				return i+1;
		}
		return 0;
	}
}
