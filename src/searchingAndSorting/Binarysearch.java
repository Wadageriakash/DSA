package searchingAndSorting;

// 01) Find the middle element
//02) In case if it is in the sorting order (Ascending order), check if the target element is greater then middle element then search in the right 
//	or else search in the left side element.
// 03) If the middle element is the target element then i found my answer.
// 04) If start becomes greater then end  s > e then element doest not found.
// 05) N/2k  = 1 means N = 2k then we can write the log(N) = log(2k)
// k = log2N
// Total comparision in worst case logN

// finding the middle element is like (0+n)/2

public class Binarysearch {

	public static void main(String[] args) {
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int target = 22;
		int ans = binarySearch(arr, target);
		System.out.println(arr[ans]); // 22
	}
	
	// return the index
	// return -1 if it doesnot exist
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			// find the middle element
			// int mid = (start + end) /2 ;  // might be possible that (start + end ) exceeds the range of int in java 
			// better way to do the same thing is 
			int mid = start + (end - start) /2 ;
			
			if(target < arr[mid]) {
				end = mid -1;
				
			} else if (target > arr[mid]) {
//				end = arr.length -1;
				start = mid + 1;
			} else {
				// answer found
				return mid;
			}
		}
		return -1;
	}

}
