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


// This code prints the array in reverse
// We need the array itself to have the elements reversed
