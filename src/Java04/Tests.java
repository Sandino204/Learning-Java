package Java04;

public class Tests {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int where = SearchAlgoritms.binarySearch(arr, 9);
		System.out.println(where);
		
		int[] arr2 = {10, 20, 9, 12, 24, 8};
		
		int[] sorted = SortAlgorithms.quick_sort(arr2, 0, 5);
		
		for(int i = 0; i < sorted.length; i++) {
			System.out.print(" " + sorted[i]);
		};
		
		System.out.println("");
		
		int[] coins = {10, 50, 25};
		coins = SortAlgorithms.quick_sort(coins, 0, 2);
		int solution = Geedy.solve(coins, 90);
		System.out.println("The number of coins is: " + solution);
		
		int[] array = {1, 2, 1, -1, 6, 5};
		int[] array2 = {1, 2, -1, 6, 1, 5};
		int[] array3 = {1, 2, 2, 1, 6, 5};
		int sum = SumZero.solution(array);
		System.out.println(sum);
		sum = SumZero.solution(array2);
		System.out.println(sum);
		sum = SumZero.solution(array3);
		System.out.println(sum);
		
		sum = SumZero.solution2(array);
		System.out.println(sum);
		sum = SumZero.solution2(array2);
		System.out.println(sum);
		sum = SumZero.solution2(array3);
		System.out.println(sum);
	}
}
