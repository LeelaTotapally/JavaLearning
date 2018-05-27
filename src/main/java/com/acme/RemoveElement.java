package com.acme;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void printRemovedElement(int index)
	{
		List<String> list = new ArrayList<String>();
		list.add("Pink");
		list.add("Blue");
		list.add("Black");
		System.out.println(list);
		System.out.println(list.remove(index));
	}

}
