package com.acme.arrays;

public class IntegerPairs {
	public static void checkPairs(int[] array, int num)
	{
		int num1 = array[0];
		for(int i = 1; i<array.length;i++)
		{
			if(num == (num1 + array[i]));
			{
				System.out.println(num1 + "," + array[i]);
			}
		}
	}

}
