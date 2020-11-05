package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_01_01 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.print("Orginal array: ");
		printArray(array);

		// reverse array iteratively
		iterativeReverse(array);
		System.out.print("Iteratively reversed array: ");
		printArray(array);

		// reverse array recursively
		recursiveReverse(array, 0, array.length - 1);
		System.out.print("Recursively reversed array: ");
		printArray(array);
	}

	private static void recursiveReverse(int[] array, int i, int j) {

		if (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			recursiveReverse(array, i + 1, j - 1);
		}
	}

	private static void iterativeReverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}