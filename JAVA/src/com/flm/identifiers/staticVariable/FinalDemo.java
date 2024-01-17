package com.flm.identifiers.staticVariable;

public class FinalDemo {
	
	static final int gst =18;
	public static void main(String[] args) {
		
		FinalDemo f1 =new FinalDemo();
		System.out.println(FinalDemo.gst);
		
		FinalDemo f2 =new FinalDemo();
		//FinalDemo.gst=19;  
		System.out.println(FinalDemo.gst);
		
	}

}
