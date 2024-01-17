package Blocks;
class B{
	static {
		System.out.println("static block A class");
	}
	{
		System.out.println("non-static block from A class");
	}
}

public class Demo3 {
	static {
		System.out.println("static block from test class");
	}

	public static void main(String[] args) {
		System.out.println("hello");
		B a1=new B();
		Demo3 t = new Demo3();
	}
	{
		System.out.println("non static block from test class");
	}

}
