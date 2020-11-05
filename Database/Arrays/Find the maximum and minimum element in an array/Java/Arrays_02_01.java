package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_02_01 {
	public static void main(String[] args) {
        int array[] = {1000, 11, 445, 1, 330, 3000};

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}

		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min);
	}
}