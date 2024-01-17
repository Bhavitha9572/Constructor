package com.flm.identifiers.staticVariable;

public class Simcard {

	int id;
	String name;
	static String companyName;

	public static void main(String[] args) {

		Simcard e1 = new Simcard();
		e1.id = 11;
		e1.name = "Ramesh";
		Simcard.companyName = "TCS";

		System.out.println("el Employee is ");
		System.out.println("id is " + e1.id);
		System.out.println("name is " + e1.name);
		System.out.println("company name is " + Simcard.companyName);

		Simcard e2 = new Simcard();
		e2.id = 11;
		e2.name = "Suresh";
		Simcard.companyName = "CTS";

		System.out.println("e2 Employee is ");
		System.out.println("id is " + e2.id);
		System.out.println("name is " + e2.name);
		System.out.println("company name is " + Simcard.companyName);
		System.out.println("____________________________"); 
		
		System.out.println("Ramesh " +e1.companyName); 
	}

}
