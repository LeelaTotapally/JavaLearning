package com.acme.arrays;

public class SelectionSortExample {
	public static void selectionSort(int[] array) {

		int iterations = array.length;

		for (int i = 0; i < iterations - 1; i++) {
			int smallestIndex = i;
			int smallestElement = array[smallestIndex];
			for (int j = i + 1; j < iterations; j++) {
				if (array[j] < smallestElement) {
					smallestElement = array[j];
					smallestIndex = j;

					int temp = array[i];
					array[i] = array[smallestIndex];
					array[smallestIndex] = temp;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}

}
