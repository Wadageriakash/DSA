package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*•	Move Zeroes: Move all zeroes in an array to the end without changing the relative 
 * order of non-zero elements.*/

public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 0, 12, 3 };
		System.out.print("Original array 1: " + Arrays.toString(arr1));
		moveZeroes(arr1);
		System.out.print("After moving zeroes: " + Arrays.toString(arr1));

	}

	private static void moveZeroes(int[] arr1) {
		if (arr1 == null || arr1.length <= 1)
			return;

		int insertPos = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				arr1[insertPos] = arr1[i];
				insertPos++;
			}
		}
		while (insertPos < arr1.length) {
			arr1[insertPos] = 0;
			insertPos++;
		}

		// Using the stream ......

		List<Integer> nonZero = Arrays.stream(arr1).filter(i -> i != 0).boxed() // convert IntStream to Stream<Integer>
				.collect(Collectors.toList());
		System.out.println(nonZero);

		// count the number of zeros in the original array
		long zeroCount = Arrays.stream(arr1).filter(i -> i == 0).count();
		System.out.println(zeroCount); // 2

		for (int i = 0; i < zeroCount; i++) {
			nonZero.add(0);
		}
		System.out.println(nonZero); // [1, 12, 3, 0, 0]

	}

}
