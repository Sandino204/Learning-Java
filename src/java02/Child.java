package java02;

public class Child extends Parent {
	int age = 0;
	
	Child(int a, String s){
		super(s);
		age = a;
	}
	
	
	public void show_age() {
		System.out.println(age);
	}
}
