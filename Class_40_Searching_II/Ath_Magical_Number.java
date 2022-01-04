package Class_40_Searching_II;

public class Ath_Magical_Number {
	public static int nthMagicalNumber(int N, int A, int B) {
		int MOD = 1000000007;
		int L = A / gcd(A, B) * B;

		long lo = 0;
		long hi = (long) N * Math.min(A, B);
		while (lo < hi) {
			long mi = lo + (hi - lo) / 2;
			if (mi / A + mi / B - mi / L < N)
				lo = mi + 1;
			else
				hi = mi;
		}

		return (int) (lo % MOD);
	}

	public static int gcd(int x, int y) {
		if (x == 0)
			return y;
		return gcd(y % x, x);
	}

	public static void main(String[] args) {
		int A = 4;
		int B = 2;
		int C = 3;
		
		int ans = nthMagicalNumber(A,B,C);
		System.out.println(ans);
	}

}
