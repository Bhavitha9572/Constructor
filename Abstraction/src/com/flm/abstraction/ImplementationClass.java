package com.flm.abstraction;

public class ImplementationClass implements MyInterface {
	
	public static void main(String[] args) {
		ImplementationClass imp =new ImplementationClass();
		imp.m1();
		imp.m2();
	}

	@Override
	public void m1() {
		
		System.out.println("Hello");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
