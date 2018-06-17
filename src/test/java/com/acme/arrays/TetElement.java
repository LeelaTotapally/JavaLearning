package com.acme.arrays;

import org.junit.Test;

public class TetElement {
	@Test
	public void testElement()
	{
		int[] array = {1,2,3,4};
		int element = 9;
		ContainsThatElement.checkElement(array, element);
		
	}

}
