package com.flm.identifiers;

public class Problems {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int sumofTenNumbers = 55;   //n(n+1/2) ==55  n we have 10 no
		int sumOfArrayElememts=0;
		for(int i =0;i<a.length;i++) { 
			sumOfArrayElememts =sumOfArrayElememts+a[i];
		}
		int MissingNumber = sumofTenNumbers -sumOfArrayElememts;
		System.out.println(MissingNumber);
	}

	private static void MissingNumberTrail() {
		int n =10;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		for (int i = 1; i <= a.length - 1; i++) {
			for (int j = 1; j <= n; j++) {

				if (!(j == a[i - 1])) {

					System.out.println(j);

				}
				
				i++;
			}
		}
//output:8
//		9
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
//			at com.flm.identifiers.VariableDemo.main(VariableDemo.java:11)
	}

	private static void EqualNumber() {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		for (int i = 1; i < a.length - 1; i++) { // i<a.length-1
			if (!(i == a[i - 1])) {
				System.out.println(a[i]);
			}

		}
	}

}
