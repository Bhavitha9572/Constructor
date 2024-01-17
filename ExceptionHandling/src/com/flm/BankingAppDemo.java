package com.flm;

import java.util.Scanner;

public class BankingAppDemo {
	public static void main(String[] args) {
		System.out.println("welcome to utut bank ");
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter min deposit balance ");
		try {
			int minBal=sc.nextInt();
			if(minBal<1000) {
				throw new MinimumBalanceException("min balanc must be greater than 1000");
			}
		}
		catch (Exception e) {
			System.out.println("somethimg went wrong");
			
		//	System.out.println(e.getMessage());
		}
		finally {
			System.out.println("poyam mosam");
		}
	}

}
