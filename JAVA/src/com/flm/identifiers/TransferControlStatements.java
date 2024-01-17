package com.flm.identifiers;

public class TransferControlStatements {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {

				continue;
			}
			System.out.println(i);
		}
	}

	private static void Break() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {

				break;
			}
			System.out.println(i);
		}
	}

}
