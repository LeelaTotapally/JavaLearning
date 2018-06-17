package com.acme.arrays;

public class SmallestNumber {
	public static void printSmallestNumber(int[] array)
	{
		int minIndex =  0;
		int minElement = array[minIndex];
		int length = array.length;
		for(int i = 1; i<length; i++)
		{
			if(minElement > array[i])
			{
				int temp = minElement;
				minElement = array[i];
				array[i] = temp;
			}
		}
		System.out.println(minElement);
	}

}
