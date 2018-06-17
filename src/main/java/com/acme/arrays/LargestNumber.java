package com.acme.arrays;

public class LargestNumber {
	public static void printLargestNumber(int[] array)
	{
		int maxIndex = 0;
		int maxNum = array[maxIndex];
		for(int i = 1; i< array.length; i++)
		{
			if(maxNum < array[i])
			{
				int temp = maxNum;
				maxNum =  array[i];
				array[i] = temp;
			}
	
		}
		System.out.println("LargestNumber"+" "+maxNum);
	}

}
