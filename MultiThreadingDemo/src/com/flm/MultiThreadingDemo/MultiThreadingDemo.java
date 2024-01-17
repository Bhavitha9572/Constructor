package com.flm.MultiThreadingDemo;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		
		MyOwnThread own =new MyOwnThread();
		own.start(); //second thread is created 
	    
	    Thread prtyInfo = Thread.currentThread();
	    prtyInfo.setPriority(10);
	    System.out.println(Thread.currentThread().getPriority());
	    
	    SecondwayThreading st =new SecondwayThreading();
	    Thread t =new Thread(st);
	    t.start();
	    
		for (int i = 0; i < 10; i++) {
			System.out.println("hello " +i+ ":::" +Thread.currentThread().getName());
			
		}
//		System.out.println(Thread.currentThread().getName()); //--> dheeni valla prgoram eh thread run avuthundhi anedhi wil get info
	}


}
