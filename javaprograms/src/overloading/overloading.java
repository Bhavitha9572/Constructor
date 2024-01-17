package overloading;
public class overloading{
public void m1() {
	System.out.println("one arg");
}
public void m1(int a,int b) {
	System.out.println("two arg");
}
public void m1(int a,int b ,int c) {
	System.out.println("3 arg");
}



public static void main(String[] args) {
	  overloading d = new overloading();
	  d.m1();
      d.m1(1,2);
	}}


