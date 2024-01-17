package com.flm.polymorphism.methodOverriding;

public class Puthrudu extends Dad {
	
	public static void main(String[] args) {
		Puthrudu p =new Puthrudu();
		p.house();
	}
	
	@Override
	void house() {
 		//super.house();
		System.out.println("helllo");
	}
	
	
}
