package com.flm.MultiThreading;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Surseh sureshobject = new Surseh();
		
		Ramesh Rameshobject = new Ramesh();
		Rameshobject.sureshobject=sureshobject;
		Rameshobject.start();
		
    //  JD3 jd3 = new JD3(); 
 		sureshobject.start();
 		sureshobject.join();
		
		
		Rameshobject.join();
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("parsing data from files and save to DB");
			
		}
	}
}


class Ramesh extends Thread{
	
	Surseh sureshobject;
	
	@Override
	public void run() {
		try {
			sureshobject.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("connecting to AWS to read files");
			
		}
	}
}
	
class Surseh extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Fetch credentials from filestore");
			
		}
	}
}


