package com.acme.javaexamples;

public class Exponential {
	public static int printExpo(int base, int power) {
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return base;
		} else {
			return base * printExpo(base, power - 1);
		}

	}
}
