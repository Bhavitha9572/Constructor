package com.flm.abstraction;

public class IgApp {

	public static void main(String[] args) {
		
		InstagramLoginLogic ig = new InstagramLoginLogic();
		ig.connectDB("angel", "143");
		
		System.out.println("Time waste");
		ig.disconnectToDB("No charging");
	}

}
