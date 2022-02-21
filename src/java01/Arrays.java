package java01;

public class Arrays {
	public static void main(String[] args) {
		int[] x = new int[5];
		
		for(int i = 0; i < 5; i++) {
			x[i] = i + 1;
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println(x[j]);
		}
	}
}
