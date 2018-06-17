package com.acme.javaexamples;

public class AscendingOrder {
	public static void getAscending(int num) {
		if (num >= 10) {
			return ;
		} else {
			System.out.println(num);
			getAscending(num + 1);
		}

	}
}
