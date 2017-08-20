package com.java.sort;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {5, 2, 4, 6, 1, 3};
		printArray(arr);
		//sortByMergeSort(arr, 0, arr.length);
		
		MergeSortImplimentation merger = new MergeSortImplimentation();
		merger.sort(arr);
		printArray(arr);
	}
	
	private static void printArray(int []arr){		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

class MergeSortImplimentation{
	int[] numbers;
	int[] helper;
	int number;
	
	public void sort(int[] values){
		this.numbers = values;
		number = values.length;
		this.helper = new int[number];
		mergeSort(0, number-1);
	}

	private void mergeSort(int start, int end) {
		// TODO Auto-generated method stub
		if(start < end){
			int middle = start + (end - start)/2;
			mergeSort(start, middle);
			mergeSort(middle+1, end);
			merge(start, middle, end);
		}
	}

	private void merge(int start, int middle, int end) {
		//copy low to high into helper array
		for(int i=start; i<=end; i++){
			helper[i] = numbers[i];
		}
		
		int i = start;	//to keep the track of first array
		int j = middle +1; //second array
		int k = start; // index to add into an array
		
		//it copies all the element into numbers array in sorted form
		while(i<= middle && j <= end){
			if(helper[i] <= helper[j]){
				numbers[k] = helper[i];
				i++;
			}else{
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//copy rest elements;
		while(i<= middle){
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
	
}