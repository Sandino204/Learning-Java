package Java04;

import java.util.HashSet;

public class SumZero {
	public static int solution(int[] arr) {
		int flag = 0;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j<arr.length; j++) {
				sum +=  arr[j];
				if(sum == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				break;
			}
		}
		
		return flag;
	}
	
	public static int solution2(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		
		set.add(0);
		int sum = 0;
		for(int ele: arr) {
			sum += ele;
			if(set.contains(sum)) {
				return 1;
			}
			
			set.add(sum);
		}
		
		return 0;
	}
}
