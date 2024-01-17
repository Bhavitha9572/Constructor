package com.flm.abstraction.example;

public class IPhone {
	public static void main(String[] args) {
		//Airtel air = new Airtel();
		//Jio air = new Jio();
		Sim sim = new Jio();
		sim.calling(98480);
		sim.sendSms(32129, "Hello moto");
		sim .data("5g");
	}

}
