package com.acme.javaexamples;

import org.junit.Test;

public class TestFact {
	@Test
	public void testFact() {
		int num = 4;
		int fact = Factorial.getFact(num);
		System.out.println(fact);
	}

}
