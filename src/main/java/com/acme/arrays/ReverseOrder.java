package com.acme.arrays;

public class ReverseOrder {
	public static void printReverse(int[] array)
	{
		for(int i = array.length-1; i >=0 ; i--)
		{
			System.out.println(array[i]);
		}
	}

}
