package overloading;
class Student{
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age){
		this.id = id;
		this.name=name;
		this.age=age;
	}
	Student(int id ,Student s,int age){
		this.id=id;
		this.name=s.name;
		this.age=age;
	}
	Student(int id,String name ,Student s){
		this.id=id;
		this.name=name;
		this.age=s.age;
	}
	public void display() {
		System.out.println("id="+id+ " name="+name+ " age="+age);
	}
}

public class CopyConstructor {
	public static void main (String[]args) {
		Student s1=new Student(101,"raja",22);
		Student s2=new Student(102,s1,22);
		Student s3=new Student(103,"rani",s2);
		s1.display();
		s2.display();
		s3.display();
	}

}

