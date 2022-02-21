package Java04;

public class Geedy {
	public static int solve(int[] coins, int sum) {
		int ans = 0;
		for(int i = coins.length - 1; i >= 0; i--) {
			while(sum >= coins[i]) {
				sum -= coins[i];
				ans++;
			}
		}
		
		return ans;
	}
}
