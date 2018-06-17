package com.acme.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void removeElement(int[] array)
	{
		List<int[]> list = new ArrayList<int[]>();
		list.add(array);
		
	    list.remove(1);
	    System.out.println(list);
	}

}
