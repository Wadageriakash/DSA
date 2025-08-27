package searchingAndSorting;

import java.util.Arrays;

// Here it uses the Shifting
// Insertion works based on the condition not on the iteration so compare to for loop, It is good with the while loop.

public class InsertionOrder {

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 3, 2,1};
		
		for(int i = 0; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
