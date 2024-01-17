package com.flm.identifiers;

public class LoopingStatements {

	public static void main(String[] args) {
         for (int i =1;i<=5;i++) {
        	 System.out.println(i);
         }
	}

	private static void dowhileDemo() {
		int i = 1;
         do {
        	 if(i%2==0) {
        		 System.out.println(i);
        	 }
        	 i++;
         }
         while(i<=10);
	}

	private static void CountOfNumbers() {
		int n = 123;
         int count = 0;
         while(n>0) {
        	 n=n/10;
        	 count++;
         }
         System.out.println(count);
	}

	private static void SumofDigitsDemo() {
		int n =435;
        int rem = 0;
        while(n>0) {
        	rem = rem +n%10;
        	n= n/10;
        }
        System.out.println(rem);
	}

	private static void SumOfDigitOptimal() {
		int temp = 123;
        int rem = temp % 9 ==0 ? 9 :temp%9; //O(1) O(n) 
        System.out.println(rem);
	}

	private static void WhileDemo1() {
		int i = 1;
		while (i <= 10) {
			System.out.println("Good Morning "+i);
			i++;
		}
	}

}
