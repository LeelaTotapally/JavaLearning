package com.acme;

import org.junit.Test;

import com.acme.linkedlist.Iterate;

public class TestIterate {
	@Test
	public void testPrintIterate()
	{
		System.out.println();
		Iterate.printIterate();
		
		System.out.println();
		int index = 0;
		Iterate.printIterateIndex(index);
		
		System.out.println();
		Iterate.reverseIteration(index);
		
		System.out.println();
		Iterate.printInsert();
		
		System.out.println();
		Iterate.printInsertAtFirstAndLast();
		
		System.out.println();
		Iterate.FirstAndLastOccurences();
		
		System.out.println();
		Iterate.printRemoveElement();
		
		System.out.println();
		Iterate.printRemoveFirstAndLast();
		
		System.out.println();
		Iterate.printSwap();
		
		System.out.println();
		Iterate.printShuffle();
		
		System.out.println();
		Iterate.printJoinLinkedList();
		
		System.out.println();
		Iterate.printRetrieve();
		
		System.out.println();
		Iterate.printExists();
		
		System.out.println();
		Iterate.printEmptyOrNot();
		
	}

}
