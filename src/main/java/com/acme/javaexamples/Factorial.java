package com.acme.javaexamples;

public class Factorial {
	public static int getFact(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * getFact(num - 1);
		}

	}

}
