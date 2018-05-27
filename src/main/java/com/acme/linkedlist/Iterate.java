package com.acme.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Iterate {
	public static void printIterate()
	{
		List<String> list = new LinkedList<String>();
		list.add("India");
		list.add("Japan");
		list.add("China");
		for(String newList : list)
		{
			System.out.println(newList);
		}
	}
	    
		public static void printIterateIndex(int index)
		{
			List<String> list = new LinkedList<String>();
			list.add("India");
			list.add("China");
			for(int i = 0; i<list.size(); i++)
			{
				System.out.println(list.get(i));
				
			}
		}
		
		public static void reverseIteration(int index)
		{
			List<String> list = new LinkedList<String>();
			list.add("India");
			list.add("China");
			for(int i = list.size()-1; i>=0; i--)
			{
				System.out.println(list.get(i));
			}
		}
		
		public static void printInsert()
		{
		List<String> list = new LinkedList<String>();
		list.add("USA");
		list.add("UK");
		System.out.println(list);
		list.add(1,"Pakistan");
		System.out.println(list);
		}
	
		public static void printInsertAtFirstAndLast()
		{
			List<String> list = new LinkedList<String>();
			list.add("Brazil");
			list.add("Canada");
			list.add("Peru");
			System.out.println(list);
			((LinkedList<String>) list).addFirst("Bangladesh");
			((LinkedList<String>) list).addLast("Dubai");
			System.out.println(list);
			
		}

		public static void FirstAndLastOccurences()
		{
			List<String> list = new LinkedList<String>();
			list.add("India");
			list.add("china");
			list.add("pakistan");
			list.add("India");
			System.out.println(list.indexOf("India"));
			System.out.println(list.lastIndexOf("SIP"));
		}
		
		public static void printRemoveElement()
		{
			List<String> list = new LinkedList<String>();
			list.add("Leela");
			list.add("Deepthi");
			System.out.println(list);
			System.out.println(list.remove(1));
			System.out.println(list.remove("Leela"));
			
		}
		
		public static void printRemoveFirstAndLast()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(1000);
			list.add(2000);
			list.add(3000);
			System.out.println(list);
			System.out.println(((LinkedList<Integer>) list).removeLast());
			System.out.println(((LinkedList<Integer>) list).removeFirst());
			
		}
		
		public static void printSwap()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(1000);
			list.add(2000);
			list.add(3000);
			System.out.println(list);
			 Collections.swap(list,0,2);
			 System.out.println(list);
			 
		}
		
		public static void printShuffle()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(1000);
			list.add(2000);
			list.add(3000);
			list.add(4000);
			System.out.println(list);
			Collections.shuffle(list);
			System.out.println(list);
			
		}
		public static void printJoinLinkedList()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(1000);
			list.add(2000);
			list.add(3000);
			list.add(4000);
			System.out.println(list);
			List<Integer> newList = new LinkedList<Integer>();
			newList.add(11000);
			newList.add(232000);
			newList.add(43223000);
			newList.add(24000);
			System.out.println(newList);
			List<Integer> finalList = new LinkedList<Integer>();
			finalList.addAll(list);
			finalList.addAll(newList);
			System.out.println(finalList);
			
		}
		/*public static void printClone()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(1000);
			list.add(2000);
			list.add(3000);
			list.add(4000);
			System.out.println(list);
			List<Integer> finalList = new LinkedList<Integer>();
			
			
		}*/
		
		public static void printRetrieve()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(567);
			list.add(453);
			list.add(764);
			System.out.println(((LinkedList<Integer>) list).peekFirst());
			System.out.println(((LinkedList<Integer>) list).peekLast());
		}
		
		public static void printExists()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(567);
			list.add(453);
			list.add(764);
			System.out.println( list.contains(764));
			
		}
		
		public static void printEmptyOrNot()
		{
			List<Integer> list = new LinkedList<Integer>();
			list.add(567);
			list.add(453);
			list.add(764);
			System.out.println(list.isEmpty());
		}
}
