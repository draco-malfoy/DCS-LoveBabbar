package arrays;

/*
 * Author: https://github.com/draco-malfoy/
 */

public class Arrays_03_01 {

	static int k = 3;

	public static void main(String[] args) {
		int array[] = { 1000, 11, 445, 1, 330, 3000 };

		// QuickSort
//		Quicksort(array, 0, array.length - 1);
//		printArray(array);
//		System.out.println(k + "th element is: " + array[k-1]);

		// QuickSelect
		QuickSelect(array, 0, array.length - 1);
		printArray(array);
		System.out.println(k + "th element is: " + array[k-1]);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void QuickSelect(int[] array, int low, int high) {
		int pi = doPartition(array, low, high);
		
		if(pi == k)
			return;
		
		if(pi > k)
			QuickSelect(array, low, pi - 1);
		
		QuickSelect(array, pi+1, high);
		
	}

	private static void Quicksort(int[] array, int low, int high) {
		if (low < high) {
			int partitionIndex = doPartition(array, low, high);
			Quicksort(array, low, partitionIndex - 1);
			Quicksort(array, partitionIndex + 1, high);
		}
	}

	private static int doPartition(int[] array, int low, int high) {
		int pivot = array[high];

		int j = low - 1;

		for (int i = low; i < high; i++) {
			if (array[i] <= pivot) {
				j++;
				swap(array, i, j);
			}
		}

		swap(array, j + 1, high);

		return j + 1;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}