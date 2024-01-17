package overloading;

public class Demo3 {
	public static void main(String[]args) {
	System.out.println("main started");
     Demo3.main();
     Demo3.main(134);
}
	public static void main() {
		System.out.println("no arg");
	}
	public static void main(int a) {
		System.out.println("one arg");
	}
}
