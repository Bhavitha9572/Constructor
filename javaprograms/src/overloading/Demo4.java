package overloading;

public class Demo4 {
	public static void m1(int a) {
		System.out.println("one arg");
	}
	public static void m1(String s) {
		System.out.println("String type one arg");
	}
	public static void m1(int a,double d) {
		System.out.println("two arg");
	}
	public static void main(String[] args) {
		Demo4.m1(5);
		Demo4.m1(5,5.6);
		Demo4.m1("abc");
	}

}
