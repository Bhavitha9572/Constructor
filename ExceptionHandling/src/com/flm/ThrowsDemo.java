package com.flm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		
	}
	
	void ramesh() {
		
	}
	
	void suresh() {
		try {
			this.harish();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	} 
	
	void harish() throws FileNotFoundException {
		FileInputStream fis =new FileInputStream("hello.txt");
	}

}
