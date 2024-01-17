package com.flm.abstraction.example1;

public class Student implements BR1,BR2{

	@Override
	public void laptop() {
		
		System.out.println("Na laptop nenu thecchukunta");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.laptop();
		
	}

}
 