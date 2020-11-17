package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_07_01 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int last = array[array.length - 1];

		for (int i = array.length - 2; i >= 0; i--) {
			array[i+1] = array[i];
		}
		
		array[0] = last;
		
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}