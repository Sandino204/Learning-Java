package java02;
import java.util.Scanner;

public class ObjectOriented {
	String name = "Caio";
	int score = 10;
	
	Scanner s = new Scanner(System.in);
	
	public ObjectOriented(String n, int s){
		name = n;
		score = s;
	}
	
	public void get_details() {
		System.out.println("Type the name of Student");
		name = s.nextLine();
		System.out.println("Type the score of Student");
		score = s.nextInt();
	}
	
	public void show_details() {
		System.out.println("My name is "+ name);
		System.out.println("My Score is " + score);
	}
}
