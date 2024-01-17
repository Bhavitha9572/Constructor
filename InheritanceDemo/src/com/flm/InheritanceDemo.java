package com.flm;

public class InheritanceDemo {
	
	int x;

	public static void main(String[] args) {
		
		InheritanceDemo id = new InheritanceDemo();
		id.m1();
		id.hashCode();
		
		//hashcode method ledhu aina error ravatle ndhuku ante every class ki obj
		//cls eh parent class dhantlo ivi methods vunnay andhuke manam use cheyyagaluguthunnam
		
		id.toString();
		
	}
	void m1() {
		System.out.println(" I am M1");
	}

}
