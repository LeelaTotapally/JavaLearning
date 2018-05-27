package com.acme;

import org.junit.Test;

import com.acme.threads.Threads;

public class TestThreads {
	@Test
	public void testRun()
	{
		Threads thread = new Threads();
		thread.run();
	}

}
