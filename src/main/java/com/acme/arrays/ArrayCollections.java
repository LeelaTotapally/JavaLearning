package com.acme.arrays;

import java.util.Arrays;

public class ArrayCollections {
	public static void array(int[] array) {

		int[] newArray = new int[array.length + 3];
		newArray = Arrays.copyOf(array, 5);
		System.out.println(Arrays.toString(newArray));
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

	}

}
