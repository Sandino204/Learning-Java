package java02;

public class Ifone implements Phone {
	@Override
	public void bateryLife() {
		System.out.println("100%");
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}
	
	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("$10000");
	}	
}
