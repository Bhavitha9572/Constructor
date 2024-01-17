package com.flm;

public class Simcard {
    int aadhar;
    String voterCard;
    String panCard;
	public static void main(String[] args) {
		
		Simcard sim1 =new Simcard(123);
		System.out.println(sim1.aadhar);
		
		Simcard sim2 =new Simcard(431);
		System.out.println(sim2.aadhar);
		
		Simcard sim3 = new Simcard("BTPO","BTHJ09");
		System.out.println(sim3.voterCard);
		System.out.println(sim3.panCard);
		System.out.println(sim3.aadhar);
	}
	Simcard(int aadhar){
		System.out.println("welcome to jio network");
		this.aadhar=aadhar;
	}
	
	Simcard(String voterCard, String panCard){
		this.voterCard=voterCard;
        this.panCard=panCard;
	}
	
//	output : 
//	welcome to jio network
//	123
//	welcome to jio network
//	431
//	BTPO
//	BTHJ09
//	0
}
