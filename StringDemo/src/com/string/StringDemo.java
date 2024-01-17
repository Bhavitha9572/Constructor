package com.string;

public class StringDemo {
	
	public static void main(String[] args) {
		String name="bhavitha";//scp 
		String str ="Bhavitha"; //address scp
		
		StringDemo str1= new StringDemo("bhavitha"); //heap--> comparison
		String highercaseName =name.toUpperCase();
		
		System.out.println(highercaseName);
		System.out.println(name.indexOf('a'));
		System.out.println(name.charAt(2));
		System.out.println(name.substring(2));
		System.out.println(name.equals(str));
		System.out.println(name.equalsIgnoreCase(str));
	}
	
	
	StringDemo(String s){
		
	}

}
