package com.acme;

import org.junit.Test;

import com.acme.sort.SelectionSort;

public class TestSelectionSort {
	@Test
	public void selectonSort()
	{
		int[] array = {2,1,3,4,0};
		SelectionSort.selectionSort(array);
		
	}

}
