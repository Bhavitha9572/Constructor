package com.flm.identifiers;

public class PrimeNumber {

	public static void main(String[] args) {
		int n =10;
        int  factorcount =0;
        int c =(int) Math.sqrt(n);
        for(int i=2;i<c;i++) {  
        	if(n%i==0) {
        		factorcount++;
        	}
        }
        	if(factorcount==0) {
        		System.out.println("prime number");
        	}
        	else {
        		System.out.println("not a prime number");
        	}
	       
        
	}

	private static void primeNumberDemo() {
		int n =3;
        int  factorcount =0;
        for(int i=2;i<n-1/2;i++) {  //x/2-1 sec   n-1/2 place lo manam n/2 or root n or n pettachu but time complexity will be different  
        	if(n%i==0) {
        		factorcount++;
        	}
        }
        	if(factorcount==0) {
        		System.out.println("prime number");
        	}
        	else {
        		System.out.println("not a prime number");
        	}
	}

}
