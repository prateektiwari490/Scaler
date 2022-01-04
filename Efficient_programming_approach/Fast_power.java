package Efficient_programming_approach;

public class Fast_power {
	
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
		long A = 3;
		long B = 39;
		long mod = 1000000007;
		
		System.out.println(fast_power(A, B, mod));
	}

}
