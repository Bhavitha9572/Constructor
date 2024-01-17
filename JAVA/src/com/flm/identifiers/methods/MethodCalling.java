package com.flm.identifiers.methods;

public class MethodCalling {

	public static void main(String[] args) {
          MethodCalling mc= new MethodCalling();
          mc.m1();
	}
	void m1() {
		System.out.println("m1");
		m2();
	}
	void m2() {
		System.out.println("m2");
	}

}
 