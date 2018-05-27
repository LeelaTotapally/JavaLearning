package com.acme.hashset;

import org.junit.Test;

public class TestHashSet {
	@Test
	public void printTestHashSet()
	{
		HashSetExamples.printHashSetExamples();
		
		System.out.println();
		HashSetExamples.printIterate();
		
		System.out.println();
		HashSetExamples.printSize();
		
		System.out.println();
		HashSetExamples.printEmptyHashSet();
		
		System.out.println();
		HashSetExamples.checkEmptyHashSet();
		
		System.out.println();
		HashSetExamples.ClearHashSet();
	}

}
