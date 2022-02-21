package java01;

public class Functions {
	public static void main(String[] args) {
		int a = add(1,2);
		double b = add(1.4, 1.8, 2.4);
		System.out.println("The value is: " + a);
		System.out.println(b);
		Functions testes = new Functions();
		testes.test();
		swap(10, 15);
	}
	
	public void test() {
		System.out.println("Test");
	}
	
	public static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a: " + a + " b: " + b);
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double add(double a, double b, double c) {
		return a + b + c;
	}
}
