package com.acme.javaexamples;

public class Fibonacci {
	public static int getFib(int num) {
		if (num <= 2) {
			return 1;
		} else {
			int fib = getFib(num - 1) + getFib(num - 2);
			return fib;
		}
	}

}
