package Class_33_Maths_Combinatorics;

public class Compute_nCr_mod_p {

	public static long power(long x, long y, long p) {
		long res = 1;

		x = x % p;

		while (y > 0) {
			if (y % 2 == 1) {
				res = (res * x) % p;
			}
			y = y >> 1;
			x = (x * x) % p;
		}
		return res;
	}

	public static void main(String[] args) {
		int A = 149;
		int B = 12;
		int C = 48157;

		if (B > A) {
//			return 0;
			System.out.println(0);
		}
		if (B == 0) {
//			return 1;
			System.out.println(1);
		}

		long[] fact = new long[A + 1];
		fact[0] = 1;

		for (int i = 1; i <= A; i++) {
			fact[i] = fact[i - 1] * i % C;
		}

		long ans = (fact[A] * power(fact[B], C - 2, C) % C * power(fact[A - B], C - 2, C) % C)%C;
//		return (int)ans;
		System.out.println(ans);
	}
}
