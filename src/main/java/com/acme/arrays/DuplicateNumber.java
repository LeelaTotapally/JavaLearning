package com.acme.arrays;

public class DuplicateNumber {
	public static void duplicateNumber(int[] array) {
		int expectedSum = 55;
		int sum = 0;
		for (int i = 0; i <array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Duplicate Number" + " " + (sum - expectedSum));
	}

}
