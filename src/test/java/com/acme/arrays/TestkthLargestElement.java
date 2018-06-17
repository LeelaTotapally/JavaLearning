package com.acme.arrays;

import org.junit.Test;

public class TestkthLargestElement {
	@Test
	public void testLargestElement()
	{
		int[] array = {2,3,1,4};
		int k = 3;
		LargestKthElement.largestKthElement(array);
		System.out.println("Largest "+ k + "th element : " +" "+ array[k-1]);
	}

}
