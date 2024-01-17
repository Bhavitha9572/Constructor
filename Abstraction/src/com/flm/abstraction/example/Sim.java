package com.flm.abstraction.example;

public interface Sim {
	
	//call sms data 
	
	int radiationLevel =1;
	int dataCost =50;
	
	String calling(int receiveNumber);
	
	void sendSms(int rxNumber, String smsContent);
	
	void data(String mode);

}
