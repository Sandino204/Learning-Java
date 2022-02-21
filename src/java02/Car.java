package java02;

public class Car extends Vehicle {
	String color = "Blue";
	int tyres = 4;
	
	public Car(String col, int ty, int c, int m) {
		super(c, m);
		color = col;
		tyres = ty;
	}
	
	public void show_car() {
		System.out.println("Im a car");
		System.out.println("My color is " + color);
		System.out.println("I have " + tyres + " Tyres");
	}
}
