package java02;

public class Vehicle {
	int cost = 530;
	int mileage = 40;
	
	public Vehicle(int c, int m) {
		cost = c;
		mileage = m;
	}
	
	public void show_vehicle() {
		System.out.println("I am a vehicle");
		System.out.println("Cost of vehicle is " + cost);
		System.out.println("The mileage is " + mileage);
	}
}
