package com.acme.javaexamples;

import org.junit.Test;

public class TestFib {
	@Test
	public void testGetFib()
	{
		int num = 8;
		int fib = Fibonacci.getFib(num);
		System.out.println(fib);
		
	}

}
