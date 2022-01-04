package Class_30_Maths_Modular_Arithmetic;

public class Very_Large_Power {

	static int fast_power(long A, long B, long mod) {
		long ans = 1;
		while (B > 0) {
			if ((B & 1) == 1) {
				ans = (ans * A) % mod;
			}
			A = (A % mod * A % mod) % mod;
			B = B >> 1;
		}
		return (int) (ans % mod);
	}

	public static void main(String[] args) {
		int A = 5;
		int B = 5;
		long fact = 1;
		long mod = (long) (1e9 + 7);
		for (long i = 2; i <= B; i += 1) {
			fact = (fact * i) % (mod - 1);
		}
		int ans = fast_power(A, fact, mod);
		System.out.println(ans);
	}

}
