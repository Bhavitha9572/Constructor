package com.flm.identifiers;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("enter string value");
		String str = scannerObject.nextLine();
		System.out.println("enter "+str);
	    char c = str.charAt(0);
	    System.out.println(c);
	}

	private static void runtimeData() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("enter a byte number");
		byte b = scannerObject.nextByte();
		
		System.out.println("enter short value");
		short s =scannerObject.nextShort();
		
		System.out.println("enter double value");
		double d =scannerObject.nextDouble();
		
		System.out.println("enter float value");
		float f = scannerObject.nextFloat();
		
		System.out.println("enter string value");
		String str = scannerObject.nextLine();
		
		System.out.println("enter char value");
		char c = scannerObject.nextLine().charAt(0);
		
		System.out.println("RESULTS");
		System.out.println("byte: "+b);
		System.out.println("short: " +s);
		System.out.println("double :"+d);
		System.out.println("float: " +f);
		System.out.println("string: "+str);
		System.out.println("char: " +c);
	}

}
