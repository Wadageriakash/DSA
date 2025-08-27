package searchingAndSorting;

import java.util.Arrays;

// for the bubble sort time complexity is o(n2) because here we have to use the two iteration, Like one for the iteration and inner loop for the compare and swap
public class BubbleSort {

	public static void main(String [] args) {
		
		int [] arr = {2, 3, 1, 7, 6, 10, 9, 8};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
