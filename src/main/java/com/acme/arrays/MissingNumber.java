package com.acme.arrays;

public class MissingNumber {
	public static void missingNumber(int[] array) {
		int sum = 0;
		int expectedSum = 55;
		int length = array.length;
		
		for (int i = 0; i < length; i++) {
			sum = sum + array[i];
		}
		
		System.out.println(sum);
		System.out.println("Missing number" + " " + (expectedSum - sum));
	}

}
