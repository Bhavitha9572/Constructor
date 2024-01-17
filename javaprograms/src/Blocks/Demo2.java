package Blocks;

class A{
	static {
	System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		System.out.println("hello");
        A a1=new A();
	}

}
