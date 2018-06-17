package com.acme.arrays;

import org.junit.Test;

public class TestArrayCopy {
	@Test
	public void testCopyArray() {
		int[] array = { 1, 2, 3, 4 };
		ArrayCopy.copyArray(array);
	}

}
