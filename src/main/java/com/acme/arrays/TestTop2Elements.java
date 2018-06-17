package com.acme.arrays;

import org.junit.Test;

public class TestTop2Elements {
	@Test
	public void testTop2()
	{
		int[] array = {4,8,9,1};
		Top2Elements.top2Elements(array);
		System.out.println("Top 2 Elements");
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

}
