package com.acme;

public class SelectionSort {
	public static void selectionSort(int[] array)
	{
		int smallestIndex = 0;
		int smallestElement = array[0];
		int iterations = array.length;
		for(int i=0;i<iterations;i++)
		{
			for(int j=i;j<iterations;j++)
			{
				if(smallestElement > array[j])
				{
					smallestElement = array[j];
					smallestIndex = j;
				}
			}
			int temp = array[i];
			array[i] = smallestElement;
			smallestIndex = temp;
		}
	}

}
