package com.flm.MultiThreading;

public class SyncDemo  {
	public static void main(String[] args) throws InterruptedException {
		DisplayInfo di =new DisplayInfo();
		GoodMoring gm =new GoodMoring();
		gm.displayInfo=di;
		
		Goodevening ge =new Goodevening();
		ge.displayInfo =di;
	    gm.start();
	    ge.start();
	 //   ge.join();
		}
	
	
	
	
}

class GoodMoring extends Thread{
	
	DisplayInfo displayInfo;
	@Override
	public void run() {
		displayInfo.displayMessage("good evening", 5);
	}
	
}

class Goodevening extends Thread{
	
	DisplayInfo displayInfo;
	@Override
	public void run() {
		displayInfo.displayMessage("good morning", 5);
	}
	
}

class DisplayInfo{
	void displayMessage(String message,int count) {
		
		synchronized (message) {
			for (int i = 0; i <= count; i++) {
				System.out.println(message+ "****" +i);
		}
		
			
		}
	}
}