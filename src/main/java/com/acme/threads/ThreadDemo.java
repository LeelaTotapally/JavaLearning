package com.acme.threads;

public class ThreadDemo {

	
	public static void main(String[] args) {

		Runnable runnable = new LongRunningProcess();
		
		System.out.println("Starting thread for demonstration of threads");
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		System.out.println("This is a statment that should be completed in parallel with the Runnable");
		
		boolean isCompleted = false;
		
		do {
			
			System.out.println("Querying if runnable is completed");
			
			if(!isCompleted) {
				try {
					System.out.println("Demo thread is put to sleep for 100 ms");
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LongRunningProcess longRunningProcess = (LongRunningProcess) runnable;
				
				isCompleted = longRunningProcess.isCompleted();
			}
			
			
		} while(isCompleted != true);
		
		System.out.println("Done");
		System.exit(1);
	}
}
