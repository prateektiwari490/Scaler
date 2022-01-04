package Class_33_Maths_Combinatorics;

public class SUMMATION {
	// n*(n-1)*3^(n-2)

	static int calc(int n, int mod) {
		long ans = (long) (((n % mod * (n - 1) % mod) % mod * fast_power(3, n - 2, mod) % mod) % mod);
		return (int) ans % mod;
	}

	static long fast_power(long A, long B, long mod) {
		long ans = 1;
		while (B > 0) {
			if ((B & 1) == 1) {
				ans = (ans * A) % mod;
			}
			A = (A % mod * A % mod) % mod;
			B = B >> 1;
		}
		return (ans % mod);
	}

	public static void main(String[] args) {
		int A = 39;
		int m = 1000000007;

		int ans = calc(A, m);
		System.out.println(ans);
	}

}
