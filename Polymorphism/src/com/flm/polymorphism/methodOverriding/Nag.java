package com.flm.polymorphism.methodOverriding;

import com.flm.polymorphism.MethodOverloading;

public class Nag extends ANR {

	int debts = 100;

	public static void main(String[] args) {
		Nag nag = new Nag();
		ANR anr = new ANR();
		ANR x = new Nag();

		ANR a1 = new ANR();
		ANR a2 = new Nag();

		nag.maaTV();
		a1.annapurnaStudios();
		a2.annapurnaStudios();

	}

	void maaTV() {
		System.out.println("Maa TV");
	}

	@Override
	void annapurnaStudios() { // method over riding
		System.out.println("annapurna studios with outdated");
	}

//		MethodOverloading md =new MethodOverloading();

}
