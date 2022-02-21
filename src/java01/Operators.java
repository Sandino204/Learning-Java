package java01;

public class Operators {
	public static void main(String[] args) {
		//arithmetic operators +,-,*,/
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		System.out.println(a % b);
		
		// relational operators
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		//Logical operator AND, OR
		boolean t = true;
		boolean f = false;
		
		System.out.println(f && t);
		System.out.println(t && f);
		System.out.println(t || f);
		System.out.println(f || t);
		
		
	}
}
