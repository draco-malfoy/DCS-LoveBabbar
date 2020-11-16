package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_04_01 {

	public static void main(String[] args) {

		int array[] = { 0, 2, 1, 2, 1, 2, 1, 1, 2, 0, 2, 0, 0 };

		int zeroes = 0;
		int ones = 0;
		int twos = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zeroes++;
			} else if (array[i] == 1) {
				ones++;
			} else {
				twos++;
			}
		}

		int i = 0;
		while (zeroes > 0) {
			array[i] = 0;
			zeroes--;
			i++;
		}
		while (ones > 0) {
			array[i] = 1;
			ones--;
			i++;
		}
		while (twos > 0) {
			array[i] = 2;
			twos--;
			i++;
		}

		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}