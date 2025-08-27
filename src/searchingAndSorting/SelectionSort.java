package searchingAndSorting;

import java.util.Arrays;

// for the selection sort time complexity is o(n2) but it is better then the bubble sort because we are swapping once with the each iteration
public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = {2, 3, 1, 7, 6, 10, 9, 8};
		int temp = 0;
		int minIndex = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j])
					minIndex = j;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println("ascending order :  "+ Arrays.toString(arr)); // ascending order :  [1, 2, 3, 6, 7, 8, 9, 10]
		
		for(int i = 0; i < arr.length-1; i++) {
			minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j])
					minIndex = j;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println("descending order :  "+ Arrays.toString(arr)); // descending order :  [10, 9, 8, 7, 6, 3, 2, 1]
		
	}
}
