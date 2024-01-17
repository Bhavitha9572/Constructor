package Constructor;  
class laptop{
	String name;
	int storage;
	int ram;
	String processor;
	String osname;
	laptop(){
		
	}
	laptop(String s){
	name = s;
	}
	laptop(String s ,int s1){
		name = s;
		storage = s1;
	}
	laptop(String s ,int s1,int s2){
		name = s;
		storage = s1;
		ram =s2;
	}
	laptop(String s ,int s1,int s2,String s3){
		name = s;
		storage = s1;
		ram =s2;
		processor = s3;
	}
	public void display() {
		System.out.println(name+ "\n" +storage+ "\n" +ram+ "\n" +processor);
	}
	
}

public class Demo3 {
	public static void main(String[]args) {
		laptop a=new laptop();
		laptop b=new laptop("HP");
		laptop c = new laptop("hp", 500,30,"i5");
		a.display();
		b.display();
		c.display();
	}

}
