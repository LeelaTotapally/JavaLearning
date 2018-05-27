package com.acme;

import org.junit.Test;

import com.acme.threads.ThreadCreation;

public class TestThreadCreation {
	@Test
	public void testRun()
	{
		ThreadCreation thread = new ThreadCreation();
		thread.run();
		
	}

}
