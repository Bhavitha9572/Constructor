package com.flm.abstraction;

public class InstagramLoginLogic extends DatsbaseUtils {

	@Override
	public void disconnectToDB(String wayOfDisconnect) {

		System.out.println(wayOfDisconnect+ "Disconnecting");
	}

}
