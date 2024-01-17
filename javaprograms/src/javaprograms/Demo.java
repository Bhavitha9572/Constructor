package javaprograms;
class A{
	public A() {
		System.out.println("constructor is executed");
	}
}
class C{
	public C() {
		System.out.println("Hello");
	}
}


public class Demo {

	public static void main(String[] args) {
	  A a = new A();
	  C b = new C();

	}

}
