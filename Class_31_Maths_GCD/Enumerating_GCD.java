package Class_31_Maths_GCD;

import java.math.BigInteger;

public class Enumerating_GCD {

	public static void main(String[] args) {
		String A = "100";
		String B = "100000";

		BigInteger result = new BigInteger("0");

		BigInteger a = new BigInteger(A);
		BigInteger b = new BigInteger(B);

		result = a.gcd(b);
		System.out.println(result.toString());
	}

}
