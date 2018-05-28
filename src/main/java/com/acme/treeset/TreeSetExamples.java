package com.acme.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
	public static void printExamples()
	{
		Set<String> set = new TreeSet<String>();
		set.add("Pink");
		set.add("Black");
		set.add("White");
		System.out.println(set);
	}
		
		public static void printIterate()
		{
				Set<String> set = new TreeSet<String>();
				set.add("Red");
				set.add("Blue");
				set.add("Orange");
				System.out.println(set);
				Iterator<String> iterator = set.iterator();
				while(iterator.hasNext())
				{
				System.out.println(iterator.next());
				}
				
				
		}
		
		public static void printReverseOrder()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(set);
			Iterator<String> iterator = ((TreeSet<String>) set).descendingIterator();
			while(iterator.hasNext())
			{
			System.out.println(iterator.next());
			
		}
		}
		
		public static void printFirstAndLastNumbers()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(set);
			System.out.println(((TreeSet<String>) set).first());
			System.out.println(((TreeSet<String>) set).last());
			
		}
		
		public static void printSize()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(set.size());
			
		}
		
		public static void removeElement()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(set.remove("Red"));
			
		}
		
		public static void removeAndRetieveFirst()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(((TreeSet<String>) set).pollFirst());
			System.out.println(((TreeSet<String>) set).pollLast());
		}
		
		public static void printExample()
		{
			Set<String> set = new TreeSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Orange");
			System.out.println(set);
			System.out.println(((TreeSet<String>) set).tailSet("Red"));
		}
		
		public static void printElement()
		{
			Set<Integer> set = new TreeSet<Integer>();
			set.add(1);
			set.add(2);
			set.add(3);
			System.out.println(((TreeSet<Integer>) set).tailSet(2));
		}
		
		
	

}
