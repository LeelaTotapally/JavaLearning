package com.acme.arrays;

import org.junit.Test;

public class TestContains {
	@Test
	public void testContains()
	{
		int[] array = {1,2,3};
		boolean result = ContainsDuplicateNumber.checkDuplicateNumber(array);
		System.out.println(result);
	}

}
