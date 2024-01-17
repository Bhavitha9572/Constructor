package com.flm.MultiThreadingDemo;

public class MyOwnThread extends Thread {
	
	@Override
	public void run() {
		setName("second thread");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("hi " +i+ "::::" +Thread.currentThread().getName());
			
		}
	}

}
