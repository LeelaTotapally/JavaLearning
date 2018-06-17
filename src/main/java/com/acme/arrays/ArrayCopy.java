package com.acme.arrays;

public class ArrayCopy {
	public static void copyArray(int[] array) {
		int[] newArray = new int[array.length];
		int length = array.length;
		for (int i = 0; i < length; i++) {
			newArray[i] = array[i];
			System.out.println(newArray[i]);

		}
	}

}
