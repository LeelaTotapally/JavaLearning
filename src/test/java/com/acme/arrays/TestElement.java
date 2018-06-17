package com.acme.arrays;

import org.junit.Test;

public class TestElement {
	@Test
	public void testIntegerPair()
	{
		int[] array = {1,2,3,2};
		int num = 4;
		IntegerPairs.checkPairs(array, num);
	}

}
