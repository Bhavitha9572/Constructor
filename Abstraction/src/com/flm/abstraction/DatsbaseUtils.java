package com.flm.abstraction;

public abstract class DatsbaseUtils {
	
	//DB java --> DB (DB connection, disconnect)
	
	public void connectDB(String userName, String password) {
		System.out.println("using" +userName+ "and" +password+ "connection");
		System.out.println("..........");
		System.out.println("connected to db sucessfully");
		
		
	}
	
	public abstract void disconnectToDB(String wayOfDisconnect);

}
