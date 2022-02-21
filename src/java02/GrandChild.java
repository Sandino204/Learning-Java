package java02;

public class GrandChild extends Child {
	String gender = "";
	
	public GrandChild(String s, int a, String g) {
		super(a, s);
		gender = g;
	}
	
	public void get_gender() {
		System.out.println(gender);
	}
}
