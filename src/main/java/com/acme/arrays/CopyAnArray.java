package com.acme.arrays;

import java.util.Arrays;

public class CopyAnArray {
	public static void CopyArray(int[] array)
	{
		int[] newArray = new int[array.length];
		System.arraycopy(array, 0, newArray, 0, array.length);
		System.out.println(Arrays.toString(newArray));
		
		newArray = new int[10];
		System.arraycopy(array, 0, newArray, 2, array.length);
		System.out.println(Arrays.toString(newArray));
		
		newArray = new int[10];
		System.arraycopy(array, 0, newArray, 2, array.length);
		for(int i = 0; i< newArray.length; i++)
		{
			System.out.println(newArray[i]);
		}
	}

}
