package com.flm.polymorphism;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading md =new MethodOverloading();
		md.sayHello();
		md.sayHello(5);
		md.sayHello("Bhavi");
	}	
	void sayHello() {
		System.out.println("Hello");
	}
	
	void sayHello(String name) {
		System.out.println("Helo " +name);
		
	}
	
	void sayHello(int count) {
		System.out.println("Count 0");
	}

}
