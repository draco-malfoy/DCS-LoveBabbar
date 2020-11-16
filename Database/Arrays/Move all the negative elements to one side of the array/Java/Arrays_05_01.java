package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_05_01 {

	public static void main(String[] args) {

		int array[] = { -8, 2, -1, -2, 1, -2, 1, -1, -2, 0, -4, -9 };

		int j = array.length - 1;
		for (int i = 0; i < j; i++) {
			if (array[i] < 0) {
				while (array[j] < 0)
					j--;
				swap(array, i , j);
				j--;
			}
		}

		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}