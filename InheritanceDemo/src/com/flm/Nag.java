package com.flm;

public class Nag extends ANR{
	int debts =100;
	public static void main(String[] args) {
		Nag nag = new Nag();
		nag.maaTV();
		nag.nConvention();
		nag.annapurnaStudios();
		nag.farmHouse();
		nag.Showdebts();
		System.out.println("Bank Balance"+nag.bankBalance);
	}
		

	void maaTV(){
		System.out.println("Maa TV");
	}
	
	void nConvention() {
		System.out.println("N Convention hall");
	}
	
	void Showdebts() {
		System.out.println(this.debts);
		System.out.println(super.debts);
	}

}
