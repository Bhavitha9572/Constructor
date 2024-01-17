package Blocks;

//import java.security.PublicKey;

public class Demo1 {
	static {
		System.out.println("static block-1");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
	static {
		System.out.println("static block-2");	 
	}
	static {
		System.out.println("static block-3");
	}
	

}
