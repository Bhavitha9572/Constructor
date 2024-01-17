package javaprograms;

class Student{
	String name ;
	int rollno;
	Student(String name,int r){
	this.name=name;
	rollno = r;
	}
	public void display() {
		System.out.println("name:"+name+"rollno:"+rollno);
	}
}
public class Test {

	public static void main(String[] args) {

		Student s1=new Student("raj",1);
		s1.display();
		Student s2=new Student("raja",2);
		Student s3=new Student("ram",3);
		s2.display();
		s3.display();
	}
	

}
