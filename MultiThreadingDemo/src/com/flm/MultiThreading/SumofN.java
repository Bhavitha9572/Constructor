 package com.flm.MultiThreading;

public class SumofN {

	public static void main(String[] args) throws InterruptedException {
		
		T2 t =new T2();
		t.start();
		
		synchronized (t) {
			t.wait();
			System.out.println("sum is"+t.sum);
		}
		
		
		
	  
	}
}
	
	class T2 extends Thread
	{
		int sum;
		@Override
		public void run() {
			
			synchronized (this) {
				for (int i = 0; i <= 100  ; i++) {
					sum+=i;
			}
			this.notify();	
		}
		
	}

}
