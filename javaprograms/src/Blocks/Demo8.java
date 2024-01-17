package Blocks;

class F{
	static {
		System.out.println("static -1");
	}
	{
		System.out.println("non-static-1");
	}
	F(){
		System.out.println("constructor");
	}
}
public class Demo8 {

	public static void main(String[] args) {
	F a = new F();
	F a1 = new F();

	}

}
