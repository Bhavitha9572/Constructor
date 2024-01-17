package javaprograms;

public class Construct {

	public Construct() {
		System.out.println("constructer is executed");
		
		
	}
	public Construct(int i) {
		System.out.println("one arg constructor"); //this keyword is used value for current object
	}
	public Construct(int i ,int j) {
		System.out.println("two arg constructor");
	}

	public static void main(String[] args) {
		Construct a1 = new Construct();
		Construct a2 = new Construct(10);
		Construct a3 = new Construct(10,20);
		

	}

}
