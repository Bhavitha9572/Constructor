package com.flm.abstraction;

public class C extends B {

	@Override
	void hack(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sayHelo(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		//B b =new B();
		B b =new C();
		b.hack("chinni");
	}
	

}
