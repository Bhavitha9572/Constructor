package overloading;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.m1('a');
		d.m1(2.5f);
		// TODO Auto-generated method stub

	}
	public void m1(int a) {
		System.out.println("hellow");
	}
		public void m1(double d){
			System.out.println("hi");
	 }
}


