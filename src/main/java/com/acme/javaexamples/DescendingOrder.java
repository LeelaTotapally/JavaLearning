package com.acme.javaexamples;

public class DescendingOrder {
	public static void printDescendingOrder(int num) {
		if (num <= 0) {
			return;
		} else {
			System.out.println(num);
			printDescendingOrder(num - 1);
		}
	}

}
