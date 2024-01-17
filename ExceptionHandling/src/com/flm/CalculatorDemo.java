package com.flm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Mit");
		System.out.println("enter first num");
		int res = 0;
		try {
			int firstNum = sc.nextInt(); // 2 hello
			System.out.println("enter second num");
			int secondNum = sc.nextInt(); // 0
			res = firstNum / secondNum; // ArithmeticException InputMismatchException
			
		} catch (ArithmeticException|InputMismatchException exceptionref) {
			System.out.println("don't divide with 0");
			String msg= exceptionref.getMessage();
			
			System.out.println(msg);

		} catch (ArrayIndexOutOfBoundsException inp) {
			System.out.println("dont use another data types values ");  // problem raise avuthene ivi theesukuntundhi
																		// ledhante normal ga execute avthundhi
		} 

		catch (Exception e) {
			System.out.println("OOPS smtng wrong");
		}
		
		finally {
			System.out.println("I am finally");
			sc.close();
		}
		System.out.println("result is " + res);
		System.out.println("Thank you for using");
		
		
	}
	

}
