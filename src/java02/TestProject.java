package java02;

public class TestProject {
	public static void main(String[] args) {
//		ObjectOriented teste = new ObjectOriented("Caio", 10);
//		teste.show_details();
//		teste.get_details();
//		teste.show_details();
		
		Car teste1 = new Car("Blue", 10, 25, 30);
		teste1.show_car();
		teste1.show_vehicle();
		
		GrandChild obj = new GrandChild("Caio", 10, "Male");
		obj.get_gender();
		obj.show_name();
		obj.show_age();
		
		Cat objCat = new Cat();
		Dog objDog = new Dog();
		
		objCat.animalSound();
		objDog.animalSound();
		
		Ifone i = new Ifone();
	
		i.bateryLife();
		i.color();
		i.cost();
	}
}
