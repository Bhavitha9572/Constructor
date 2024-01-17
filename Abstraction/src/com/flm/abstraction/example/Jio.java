package com.flm.abstraction.example;

public class Jio implements Sim {

	@Override
	public String calling(int receiveNumber) {
		
		System.out.println("calling from JIo");
		return "Call connected";
	}

	@Override
	public void sendSms(int rxNumber, String smsContent) {
		
		System.out.println("sms using Jio power tech");
	}

	@Override
	public void data(String mode) {
		
		System.out.println("Jio 5g");
	}

}
