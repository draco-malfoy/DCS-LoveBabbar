package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_08_01 {

	public static void main(String[] args) {
		int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

		// Brute force
		int max = 0, start = 0, end = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int sum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				sum = sum + array[j];
				if (sum > max) {
					max = sum;
					start = i;
					end = j;
				}
			}
		}
		printArray(array, start, end);
		System.out.println(max);

		// kadanes algorithm

	}

	private static void printArray(int[] array, int i, int j) {
		for (int k = i; k <= j; k++)
			System.out.print(array[k] + " ");
		System.out.println();
	}
}