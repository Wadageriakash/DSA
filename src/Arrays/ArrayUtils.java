package Arrays;

import java.util.Arrays;

public class ArrayUtils {

	public void printArray(int[] myArray) {
//		int length = myArray.length;
//		for (int i = 0; i < length; i++) {
//			System.out.print(myArray[i] + "  ");
//		}
//		System.out.println();
		
		
		// using the stream
        Arrays.stream(myArray).forEach(i -> {
            System.out.println(i);
        });
        
	}

	public void arrayDemo() {
		int[] myArray = new int[5];
		myArray[0] = 1;
		myArray[1] = 3;
		myArray[2] = 6;
		myArray[3] = 7;
		myArray[4] = 10;
		printArray(myArray);
	}

	public static void main(String[] args) {
		ArrayUtils arrayutil = new ArrayUtils();
		arrayutil.arrayDemo();
	}
}