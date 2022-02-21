package java01;

public class AddingArrays {
	public static void main(String[] args) {
		int[] x = new int[5];
		int[] y = new int[5];
		int[] z = new int[5];
		
		for(int i = 0; i < 5; i++) {
			x[i] = i + 1;
			y[i] = i + 10;
		}
		
		for(int k = 0; k < 5; k++) {
			z[k] = x[k] + y[k];
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println(z[j]);
		}
	}
}
