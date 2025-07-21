package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray{

    public static void reverseArray(int[] myArray){
       
        
        int length = myArray.length;
        int[] reverseArray = new int[length];
        for (int i = 0; i < length; i++) {
            reverseArray[i] = myArray[length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
    public static void main(String[] args)    {
        int[] myArray = {2, 3, 4, 5, 6, 7, 8, 9, 10};
         reverseArray(myArray); // [10, 9, 8, 7, 6, 5, 4, 3, 2]
         int[] myArray2 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
         reverseArrayUsingStream(myArray2); // [10, 9, 8, 7, 6, 5, 4, 3, 2]
    }
    
	private static void reverseArrayUsingStream(int[] myArray) {
	// Conveting int []  into Integer[]
		Integer[] intArray = Arrays.stream(myArray).boxed().toArray(Integer[]::new);
		// convert intArray into List
		List<Integer> numArray = Arrays.asList(intArray);
		
		Collections.reverse(numArray);
		System.out.println(numArray); // [10, 9, 8, 7, 6, 5, 4, 3, 2]
	}
}