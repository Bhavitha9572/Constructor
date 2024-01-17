package javaprograms;
class Employee{
	String name;
	int id;
	String doj;
	Employee(String name,int i,String d){
	this.name = name;
	id = i;
	doj = d;
	}

public void display() {
	System.out.println("name:"+name+" id:"+id+" DOJ:"+doj);
	
}
	
	
}

public class Demo2 {
	public static void main(String[] args) {
		Employee s1=new Employee("raj",1,"01-jan-21");
		s1.display();
		Employee s2=new Employee("raja",2,"22-jan-21");
		Employee s3=new Employee("ram",3,"01-mar-21");
		s2.display();
		s3.display();
	}
	

}
