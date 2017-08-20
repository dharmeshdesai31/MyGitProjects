package com.java.sort;

public class HeapSort {
	/*.
	 * It is similar to selection sort where we first find the maximum element and 
	 * place the maximum element at the end. We repeat the same process for remaining 
	 * element.
	 * If the parent node is stored at index I, the left child can be calculated 
	 * by 2 * I + 1 and right child by 2 * I + 2 (assuming the indexing starts at 0).
	 */
	/*
	 function heapSort(a, count) is
   	 input: an unordered array a of length count
 
   (first place a in max-heap order)
   heapify(a, count)
 
   end := count - 1
   while end > 0 do
      (swap the root(maximum value) of the heap with the
       last element of the heap)
      swap(a[end], a[0])
      (decrement the size of the heap so that the previous
       max value will stay in its proper place)
      end := end - 1
      (put the heap back in max-heap order)
      siftDown(a, 0, end)
      
      
      function heapify(a,count) is
   (start is assigned the index in a of the last parent node)
   start := (count - 2) / 2
   
   while start >= 0 do
      (sift down the node at index start to the proper place
       such that all nodes below the start index are in heap
       order)
      siftDown(a, start, count-1)
      start := start - 1
   (after sifting down the root all nodes/elements are in heap order)
 
	function siftDown(a, start, end) is
   (end represents the limit of how far down the heap to sift)
   root := start

   while root * 2 + 1 <= end do       (While the root has at least one child)
      child := root * 2 + 1           (root*2+1 points to the left child)
      (If the child has a sibling and the child's value is less than its sibling's...)
      if child + 1 <= end and a[child] < a[child + 1] then
         child := child + 1           (... then point to the right child instead)
      if a[root] < a[child] then     (out of max-heap order)
         swap(a[root], a[child])
         root := child                (repeat to continue sifting down the child now)
      else
         return
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9, 4, 3, 7};
		
		sortByHeapSort(arr);
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

	private static void sortByHeapSort(int[] arr) {
		heapify(arr, arr.length);
		int end = arr.length - 1;
		while(end>0){
			swap(arr, end, 0);
			end = end - 1;
			shiftDown(arr, 0, end);
		}
	}

	private static void heapify(int[] arr, int length) {
		int start = (length - 2)/ 2;
		while(start >= 0){
			shiftDown(arr, start, length - 1);
			start = start - 1;
		}	
	}

	private static void shiftDown(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int root = start;
		while((root*2+1) <= end)
		{
			int child = root*2+1;
			if(child+1 <= end && arr[child] < arr[child+1]){
				child = child+1;
			}
			if(arr[root] < arr[child]){
				swap(arr, root, child);
				root = child;
			}else{
				return;
			}
		}
	}
	
	private static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
