package Arrays;

import java.util.Arrays;

public class ResizeArray {

	public static void main(String[] args) {
		int[] num = { 3, 6, 7, 1 };
		int capacity = 6;
		int[] result = resize(num, capacity);
		System.out.println(Arrays.toString(result));
	}

	public static int[] resize(int[] num, int capacity) {
		int temp[] = new int[capacity];
		for (int i = 0; i < num.length; i++) {
			temp[i] = num[i];
		}
		num = temp;
		return num;
	}
}
