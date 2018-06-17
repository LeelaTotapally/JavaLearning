package com.acme.arrays;

public class Top2Elements {
	public static void top2Elements(int[] array)
	{
		for(int i = 0; i<array.length;i++)
		{
			for(int j = 0; j<array.length - 1; j++)
			{
				if(array[j] < array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		for(int k = 0; k<array.length;k++)
		{
			System.out.println(array[k]);
		}
	}

}
