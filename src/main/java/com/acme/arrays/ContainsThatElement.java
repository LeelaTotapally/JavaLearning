package com.acme.arrays;

public class ContainsThatElement {
	public static void checkElement(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (element == array[i]) {
				System.out.println("Array contains that particular element");
			}
		}

		System.out.println("Array doesn't contain that particular element");

	}

}
