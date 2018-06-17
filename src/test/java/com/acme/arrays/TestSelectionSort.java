package com.acme.arrays;

import org.junit.Test;

public class TestSelectionSort {
	@Test
	public void testSelectionSort() {
		int[] array = { 2, 3, 4, 1, -9 ,7};
		SelectionSortExample.selectionSort(array);
	}

}
