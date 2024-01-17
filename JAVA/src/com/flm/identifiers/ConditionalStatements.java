package com.flm.identifiers;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter favt day");
		 int favDay = sc.nextInt();
		 switch(favDay) {
		 case 1:{
			 System.out.println("Monday");
			 break;
		 }
		 case 2:{
			 System.out.println("Tue");
			 break;
		 }
		 case 3:{
			 System.out.println("Wed");
			 break;
		 }
		 case 4:{
			 System.out.println("Thurs");
			 break;
		 }
		 case 5:{
			 System.out.println("Fri");
			 break;
		 }
		 case 6:{
			 System.out.println("sat");
			 break;
		 }
		 default:{
			 System.out.println("Not favt day");
		 }
		 }
	}


	private static void elseifLadder() {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter your marks");
		 int marks = sc.nextInt();
		 
		 if (marks>=90 && marks <=100) {
			 System.out.println("A grade");
		 }
		 else if(marks>=75 && marks <90){
			 System.out.println("B grade");
		 }
		 else if(marks>=60 && marks < 75) {
			 System.out.println("C grade");
		 }
		 else {
			 System.out.println("Oops");
		 }
	}


	private static void NestedIf() {
		int a = 75;
		if (a > 50) {
			if (a >75) {
				System.out.println("a is above 50 and below 100");
			} else {
				if (a == 75) {
					System.out.println("A val is 75");
				} else {
					System.out.println("tada");
				}
			System.out.println("Inner if else block");
			}
		}
		else {
			System.out.println("outer if");
		}
	}
	

	private static void SigninUsingScanner() {
		String su1 = "angelpriya";
		String sp1 = "143";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a user name");
		String su2 = sc.nextLine();
		System.out.println("enter password");
		String sp2 = sc.nextLine();

		boolean UserNameMatched = su1.equals(su2); // su1==su2 Strings lo illa pedthe manaki output oops vasthundhi bcoz
													// ==
		boolean PasswordMatched = sp1.equals(sp2); // sp1==sp2 anedhi adress chusthundhi whereas equals method content
													// chusthundhi
		// if(su1==su2 && sp1==sp2)
		if (UserNameMatched && PasswordMatched) {
			System.out.println("Welcome");
		} else {
			System.out.println("OOPS eeror");
		}
		/*
		 * output: enter a user name angelpriya enter password 143 Welcome
		 */
	}

	private static void Signin() {
		String su1 = "angelpriya";
		String sp1 = "143";

		String su2 = "angelpriya";
		String sp2 = "225";

		boolean UserNameMatched = su1 == su2;
		boolean PasswordMatched = sp1 == sp2;
//	if(su1==su2 && sp1==sp2)
		if (UserNameMatched && PasswordMatched) {
			System.out.println("Welcome");
		} else {
			System.out.println("OOPS eeror");
		}
	}

	private static void EvenorOdd() {
		int a = 100;
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
