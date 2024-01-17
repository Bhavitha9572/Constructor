package com.flm.abstraction.example;

public class Airtel implements Sim{

	@Override
	public String calling(int receiveNumber) {
		
		System.out.println("Airtel calling by 5G");
		return "call Connected";
	}

	@Override
	public void sendSms(int rxNumber, String smsContent) {
		
		System.out.println("Sms sending to " +rxNumber+ " Using Airtel " +smsContent);
	}

	@Override
	public void data(String mode) {
		
		System.out.println("Internet by airtelNet router tech");
	}
	
	

}
