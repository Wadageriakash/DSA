package Arrays;

import java.util.Arrays;
import java.util.Comparator;

// This approach is Big-O 2N approach because here we have to run the twice through the Array so we can get the largest number
// at the first pass and second largest number will get at the second pass.
public class SecondLargestNumberInArray {

	public static void main(String [] args) {
		
		int[] num = {10, 20, 30, 40, 50, 70, 60, 100};
		
		int largestNumber = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] > largestNumber) {
				largestNumber = num[i];
			}
		}
		
		int secondLargestNum = -1;
		for(int i = 0; i<num.length; i++) {
			if(num[i] > secondLargestNum && num[i] != largestNumber) {
				secondLargestNum = num[i];
			}
		}
		System.out.println("SecondLargest number : "+ secondLargestNum); // 70
		
		// Method 2: using the stream...
		int secondLargestNumber  = Arrays.stream(num).sorted().skip(num.length-2).findFirst().getAsInt();
		System.out.println("secondLargestNumber : "+ secondLargestNumber); // 70
		
        // Method 3: Sort in descending order, then skip the first element and take the next
	int secondLargestOrDefault = Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(Integer.MIN_VALUE); // Provide a default value if no second largest is found
        System.out.println("Second largest (Method 3 - with orElse): " + secondLargestOrDefault);

		
	}
}
