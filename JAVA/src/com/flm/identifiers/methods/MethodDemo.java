package com.flm.identifiers.methods;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		int returnValue = SumOfTwoNumbers();
		System.out.println(returnValue);

		MethodDemo m = new MethodDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		m.sayGoodMorning(name);
//	  sayGoodMorning("Ramesh");

	}

	static int SumOfTwoNumbers() {
		int a = 10;
		int b = 20;

		int sum = a + b;
		// System.out.println(sum);
		return sum;
	}

	// i will gave name just say good morning
	void sayGoodMorning(String name) {
		System.out.println("Good Morning " + name);
	}

}
