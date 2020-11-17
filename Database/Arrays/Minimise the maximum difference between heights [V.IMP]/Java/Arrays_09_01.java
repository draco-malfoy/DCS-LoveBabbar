package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

//Minimize the heights 
public class Arrays_09_01 {

	public static void main(String[] args) {
		int K = 2;
		int arr[] = { 1, 5, 8, 10 };

		int max = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min && arr[i] - K > -1)
				min = arr[i];
		}

		System.out.println(max - min);

	}

}