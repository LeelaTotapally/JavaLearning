package com.acme.threads;

public class LongRunningProcess implements Runnable {

	private boolean isCompleted = false;
	
	public boolean isCompleted() {
		return isCompleted;
	}

	@Override
	public void run() {
		System.out.println("Simulating long running process by sleeping for 2000 ms");
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Long running process is sleeping for 20 ms");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isCompleted = true;
		System.out.println("Exiting the long running process after sleeping");
	}

}
