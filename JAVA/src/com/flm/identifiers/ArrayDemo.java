package com.flm.identifiers;

public class ArrayDemo {

	public static void main(String[] args) {
		int n = 5;
		String result[] = { "even", "odd" };
		System.out.println(result[n % 2]);

   }

	private static void IterationUsingForeach() {
		String [] names = {"Ramesh", "Suresh","Ranga"};
		for(String c:names) {
			System.out.println(c);
		}
	}

	private static void IterationUsingWhile() {
		String [] names = {"Ramesh", "Suresh","Ranga"};
		int i =0;
		while(i<names.length) {
			System.out.println(names[i]);
             i++;
		}
	}

	private static void IterationOfarrayUsingforLoop() {
		int [] marks = {10,20,30};
		   for(int i=0; i<marks.length;i++) {
			   System.out.println(marks[i]);
		   }
	}

	private static void Demo1() {
		int[] b =new int[5];
        b[0] =99; 
        b[1]=92;
        
        System.out.println(b[0]);
	}

}
