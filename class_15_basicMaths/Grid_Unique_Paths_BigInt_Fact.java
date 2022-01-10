package Class_15_basicMaths;

import java.math.BigInteger;

public class Grid_Unique_Paths_BigInt_Fact {

	public static BigInteger nCr(int n, int r) {
		BigInteger p = new BigInteger("1");
		BigInteger k = new BigInteger("1");

		if(n-r < r) {
			r = n-r;
		}
		
		if(r!=0) {
			while(r!=0) {
				
				p = p.multiply(BigInteger.valueOf(n));
				k = k.multiply(BigInteger.valueOf(r));
				 
				BigInteger m = p.gcd(k);
				p = p.divide(m);
				k = k.divide(m);
				
				n--;
				r--;
			}
		}else {
			p = new BigInteger("1");
		}
		return p;
	}

	public static void main(String[] args) {
		int n = 100;
		int m = 1;

		BigInteger ans = nCr(n + m - 2, m - 1);
		System.out.println(ans.intValue());

	}

}
