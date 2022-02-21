package Java04;

public class SearchAlgoritms {
	public static int binarySearch(int[] arr, int item) {
		int begin = 0;
		int end = arr.length;
		while(begin != end) {
			int midIndex = (begin + end) / 2;
			if(item == arr[midIndex]) {
				return midIndex;
			}else if(item > arr[midIndex]){
				begin = midIndex + 1;
			}else {
				end = midIndex - 1;
			}
		}
		
		return -1;
	}
	
	
	
	
}
