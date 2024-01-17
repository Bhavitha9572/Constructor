package com.flm.identifiers;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {2,7,3,8,0,1};
		boolean idTargetFound =false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==8) {
				System.out.println("it is there in " +i+ " index " +a[i]);
				idTargetFound = true;
				break;
			}
				  
		}
		if(!idTargetFound) {
			System.out.println("not found");
		}
		
	}

	
}
