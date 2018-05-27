package com.acme.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExamples {
	public static void printHashSetExamples()
	{
		Set<String> set = new HashSet<String>();
		set.add("GITAM");
		set.add("University");
		set.add("Hyderabad");
		System.out.println(set);
		
	}
	
	public static void printIterate()
	{
		Set<String> set = new HashSet<String>();
		set.add("GITAM");
		set.add("University");
		set.add("Hyderabad");
		System.out.println(set);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	public static void printSize()
	{
		Set<String> set = new HashSet<String>();
		set.add("GITAM");
		set.add("University");
		set.add("Hyderabad");
		System.out.println(set.size());
		
	}
	
	public static void printEmptyHashSet()
	{
		Set<String> set = new HashSet<String>();
		System.out.println(set);
		
	}
	
	public static void checkEmptyHashSet()
	{
		Set<String> set = new HashSet<String>();
		System.out.println(set.isEmpty());
		
	}
	
	public static void ClearHashSet()
	{
		Set<String> set = new HashSet<String>();
		set.add("GITAM");
		set.add("University");
		set.add("Hyderabad");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
		
	}

}
