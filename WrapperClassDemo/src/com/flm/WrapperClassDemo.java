package com.flm;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//wrapperExamp();

		String marks1 ="99";
		String marks2 ="100";
		
		System.out.println(marks1+marks2);
		
		Integer newmarks1 =Integer.valueOf(marks1);
		Integer newmarks2 =Integer.valueOf(marks2); //converting without typecastig but primitie to obj
		
		System.out.println(newmarks1);
		System.out.println(newmarks2);
		
		System.out.println(newmarks1+newmarks2);
	}

	private static void wrapperExamp() {
		int a = 10; // primitive data

		Integer i; // Integer is a class i is an reference variable for class it is a reference
					// object

		i = a; // Autoboxing--> ikkada primitive data - wrapper class or object ki conversion
				// jarigindhi

		int i2 = Integer.valueOf("9480"); // before java 1.5 we use this to convert primitive datatypes to object
		System.out.println(i2);

		Double d = Double.valueOf(12.3); // before java 1.5 we use this to convert
		double d1 = d.doubleValue();
		System.out.println(d1); // 12.3
		Integer k = 99;

		int k2 = k.intValue(); // manual auto unboxing before 1.5

		int w = k; // Autounboxing after 1.5
	}

}
