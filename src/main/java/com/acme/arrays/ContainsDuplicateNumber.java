package com.acme.arrays;



public class ContainsDuplicateNumber {
	public static boolean checkDuplicateNumber(int[] array)
	{
		for(int i = 0; i< array.length;i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(array[i] == array[j] && i !=j)
				{
					return true;
				}
			}
		}
		return false;
		
	}

}
