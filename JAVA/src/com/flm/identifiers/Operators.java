package com.flm.identifiers;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int c = 59;
		int max = (a > b) ? a : b;
		int res = max > c ? max : c;
		int ans = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println(res);
		System.out.println(ans);
	}

	private static void MaxOfTwo() {
		int a = 100;
		int b = 20;
		int HighestNumber = a > b ? a : b;
		System.out.println("Highest number is " + HighestNumber);
	}

	private static void ComparisonOperator() {
		int a = 10;
		int b = 20;

		boolean res = (a != b);
		boolean r2 = a == b;
		boolean r3 = a > b;
		boolean r4 = a >= b;
		boolean r5 = a < b;
		boolean r6 = a <= b;

		System.out.println(res); //false
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
	}

	private static void LogicaOperator() {
		boolean b1 = true;
		boolean b2 = true;

		System.out.println(!b1);
		System.out.println(((b1 && b2) || (b2 || b1)));
	}

	private static void IncAndDec() {
		int a = 10;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
	}

	private static void Incoperator() {
		int a = 10;
		a = a + 1;
		a++;
		a--;
		++a;
		--a;
		a++;
		a--;
		a = a + 1;
		a++;
		System.out.println(a);
	}

	private static void Swapping() {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		System.out.println("swaping:" + a + "" + b);
	}

	private static void Arithmetic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		int sum = a + b;

		System.out.println("addition" + (a + b));
		System.out.println("sub" + (a - b));
		System.out.println("mul" + (a * b));
		System.out.println("div" + (a / b));
		System.out.println("mod" + (a % b));
	}

}
