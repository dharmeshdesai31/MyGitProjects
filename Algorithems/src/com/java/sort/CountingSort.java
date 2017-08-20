package com.java.sort;

import java.util.Arrays;

public class CountingSort {

	//INCOMPLETE
	public static void main(String[] args) {
		int arr[] = {5, 9, 4, 3, 7};
		int B[] = new int [arr.length];
		sortByCountingSort(arr, B, 9);
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

	private static void sortByCountingSort(int[] arr, int[] B, int k) {
		// TODO Auto-generated method stub
		int[] c = new int[k+1];
		for(int l=0; l<=k; l++){
			c[l] = 0;
		}
		
		for(int j=0; j<arr.length; j++){
			c[arr[j]] = c[arr[j]]+1;
		}
		
		int i=0;
		for(i=1; i<k+1; i++){
			c[i] = c[i] + c[i-1];
		}
		
		for(int j=arr.length-1; j>=0; j--){
			B[c[arr[j]]-1] = arr[j];
			c[arr[j]] = c[arr[j]] - 1;
		}
		
		System.out.println(Arrays.toString(B));
	}

}
