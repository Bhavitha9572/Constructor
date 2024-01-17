package Blocks;
class C{
	static int i =20;
	int j = 100;
	static {
	    i=40;
		System.out.println(i);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		C a1 = new C();
	}

}
