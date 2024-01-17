package overloading;
class Circle{
	int radius;
	String color;
	Circle(int radius,String color){
		this.radius = radius;
		this.color=color;
	}
	Circle(Circle s,String color){
		this.radius = s.radius;
		this.color=color;
	}
	Circle(int radius,Circle s){
		this.radius=radius;
		this.color=s.color;
	}
	public void display() {
		System.out.println("radius=" +radius+ "\ncolor=" +color);
	}
}

public class CopyTest1 {

	public static void main(String[] args) {
		Circle s1 = new Circle(15,"white");
		Circle s2 = new Circle(s1,"black");
		Circle s3 = new Circle(20,s2);
		s1.display();
		s2.display();
		s3.display();
		

	}

}
