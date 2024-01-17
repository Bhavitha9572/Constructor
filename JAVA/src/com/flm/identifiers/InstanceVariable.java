package com.flm.identifiers;

public class InstanceVariable {
	
    int gst ;  // default value 0
	public static void main(String[] args) {

		InstanceVariable Var=new InstanceVariable();
		Var.gst =10;  //through object reference--manaki Instance variable 4 ways lo daclare cheyyachu
		              // okkati object Reference, through  constructor , getters and setters ,at the time of declaration 
		System.out.println(Var.gst); 
	}
	 void carLoan() {
		int Roi =9;  //Roi =Rate of Interest
		System.out.println("car Loan process began");
	}
	
	void HomeLoan() {
		int Roi =9;  //Roi =Rate of Interest
		System.out.println("Home Loan process began");
		System.out.println(gst);
	}
	
	void EduLoan() {
		
	}

}
