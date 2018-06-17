package com.acme;

import org.junit.Test;

import com.acme.sort.BubbleSort;

public class TestBubbleSort {
	@Test
	public void testBubbleSort() {
		int[] array = { 2, 3, 1, 4, 0, -5 };
		BubbleSort.bubbleSort(array);
	}

}
