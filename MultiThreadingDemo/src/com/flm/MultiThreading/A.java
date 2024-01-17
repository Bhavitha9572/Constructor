package com.flm.MultiThreading;

public class A extends Thread {

	@Override
	public void run() {
		setName("second thread");
		
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi " +i+ "::::" +Thread.currentThread().getName());
			
		}
		
		
	}

}

 class  K extends Thread {

	@Override
	public void run() {
		setName("third thread");
		
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi " +i+ "::::" +Thread.currentThread().getName());
			
		}
		
		
	}
	
}
