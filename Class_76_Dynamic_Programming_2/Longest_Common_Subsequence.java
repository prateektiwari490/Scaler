package Class_76_Dynamic_Programming_2;

public class Longest_Common_Subsequence {
	
	static int[][] dp;

	public static void main(String[] args) {
		
		String A = "abbcdgf";
		String B = "bbadcgf";
		
		int n = A.length();
		int m = B.length();
		
		dp = new int[n+1][m+1];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(LCS(A,B,n-1,m-1));
		
	}

	private static int LCS(String A, String B, int i, int j) {
		
		if(i<0) {
			return 0;
		}
		if(j<0) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(A.charAt(i) == B.charAt(j)) {
			dp[i][j] = 1 + LCS(A,B,i-1,j-1);
		}else {
			dp[i][j] = Math.max(LCS(A,B,i-1,j), LCS(A,B,i,j-1));
		}
		
		return dp[i][j];
	}

}
