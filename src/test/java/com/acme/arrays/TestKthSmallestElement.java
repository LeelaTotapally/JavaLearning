package com.acme.arrays;

import org.junit.Test;

public class TestKthSmallestElement {
	@Test
	public void testSmallestElement()
	{
		int[] array = {2,3,1,4};
		int k = 3;
		KthSmallestElement.kthSmallestElement(array);
		System.out.println("Least "+ k + "th element : " +" "+ array[k-1]);
	}

}
