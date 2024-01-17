package com.flm.MultiThreading;


public class AA {

	public static void main(String[] args) throws InterruptedException {
		
		A own =new A();
	     own.start();
	    
	    K s =new K();
	    s.start();
	     
	     for (int i = 0; i <= 10; i++) {
	    	 //Thread.sleep(100);
	    	 Thread.yield(); 
				System.out.println("hello " +i+ ":::" +Thread.currentThread().getName());
				
			}
	}

}
