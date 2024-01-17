package com.flm;

public class ConstructorChaining {
    int aadhar;
    String voterCard;
    String panCard;
	public static void main(String[] args) {
			
		ConstructorChaining sim1 =new ConstructorChaining(123);
			System.out.println(sim1.aadhar);
			
			ConstructorChaining sim2 =new ConstructorChaining(431);
			System.out.println(sim2.aadhar);
			
			ConstructorChaining sim3 = new ConstructorChaining("BTPO","BTHJ09");
			System.out.println(sim3.voterCard);
			System.out.println(sim3.panCard);
			System.out.println(sim3.aadhar);
		}
		ConstructorChaining(int aadhar){  //constructor overloading
			this();
			System.out.println("welcome to jio network");
			this.aadhar=aadhar;
		}
		
		ConstructorChaining(String voterCard, String panCard){   //constructor overloading 
			this.voterCard=voterCard;
	        this.panCard=panCard;
		}
		ConstructorChaining(){
			System.out.println("hello");
		}
	

}
