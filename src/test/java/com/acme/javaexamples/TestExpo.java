package com.acme.javaexamples;

import org.junit.Test;

public class TestExpo {
	@Test
	public void testExpo()
	{
		int base = 4;
		int power = 3;
		int expo = Exponential.printExpo(base, power);
		System.out.println(expo);
	}

}
