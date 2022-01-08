package Class_75_Dynamic_Programming_1;

public class Minimum_Number_of_Squares {

	public static void main(String[] args) {
		int A = 6;
		int[] dp = new int[A + 1];
		for (int i = 1; i <= A; i++) {
			int ans = Integer.MAX_VALUE;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				ans = Math.min(ans, 1 + dp[i - j * j]);
			}
			dp[i] = ans;
		}
		System.out.println(dp[A]);
	}
}
