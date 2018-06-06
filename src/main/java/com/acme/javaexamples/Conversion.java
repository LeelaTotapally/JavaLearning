package com.acme.javaexamples;

public class Conversion {
	public static void printConversion(int num) {
		if (num > 0) {
			printConversion(num / 2);
			System.out.println(num % 2);
		}
	}

}
