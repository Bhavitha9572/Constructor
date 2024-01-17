package overloading;

public class Demo1 {
	public void add(int a,int b) {
		int sum= a+b;
		System.out.println("sum of 2 digits ="+sum);
	}
	public void add(int a,int b , int c) {
		int sum=a+b+c;
		System.out.println("sum of 3 digits= "+sum);
	}

	public static void main(String[] args) {
		Demo1 c1 = new Demo1();
		c1.add(10,20 );
		c1.add(5, 6);
		c1.add(10,20,30);

	}

}
