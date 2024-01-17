package Blocks;
class Car{
	String colour;
	String brand;
	double price;
	int carno;
	static private int num =100;
	{
		carno=num;
		num++;
	}
public Car(String colour, String brand,double price) {
	this.colour=colour;
	this.brand=brand;
	this.price=price;
	
}
void CarDetails() {
	System.out.println(colour);
	System.out.println(brand);
	System.out.println(price);
	System.out.println(carno);
}
}

public class Demo5 {
	public static void main(String[] args) {
		Car C1 = new Car("Black","Bmw",500000);
		C1.CarDetails();
		System.out.println("====================");
		Car C2 = new Car("Black","Bmw",500000);
		C2.CarDetails();
		System.out.println("====================");
		Car C3 = new Car("Black","Bmw",500000);
	    C3.CarDetails();
	    System.out.println("====================");
		Car C4 = new Car("Black","Bmw",500000);
	    C4.CarDetails();
						
		
		
	}

}
