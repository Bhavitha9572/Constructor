package Constructor;
class AA{
	AA(){
		this(10,20);
		System.out.println("no arg constructor");
	}
	AA(int i,int j){
		System.out.println(i+ " "+j);
	}
	AA(int i ,int j ,int k){
		this();
		System.out.println(i+" "+j+ " "+k);
	}
}

public class demothis {

	public static void main(String[] args) {
		AA a = new AA(10,20,30);

	}

}
