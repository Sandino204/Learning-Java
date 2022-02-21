package java01;

public class FlowControll {
	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		if(x < y) {
			System.out.print("Y is greater than X");
		}else if(x > y){
			System.out.print("X is greater than Y");
		}else {
			System.out.print("X and Y are equal");
		}
	}
}
