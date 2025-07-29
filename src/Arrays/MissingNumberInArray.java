package Arrays;

public class MissingNumberInArray {

	public static void main(String [] args) {
		
		int[] num = {1, 4, 3, 2, 7, 6};
		int n = num.length + 1;
		int calculation = n*(n+1)/2;
		for (int i : num) {
			calculation = calculation - i;
		}
		System.out.println(calculation); // 5
	}
}
