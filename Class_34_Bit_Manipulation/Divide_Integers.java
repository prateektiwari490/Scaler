package Class_34_Bit_Manipulation;

public class Divide_Integers {

	public static void main(String[] args) {
		int A = -2147483648;
		int B = -1;

		int sign = (A < 0 ^ B < 0) ? -1 : 1;

		if (A == Integer.MIN_VALUE && (B == 1 || B == -1)) {
			System.out.println(Integer.MAX_VALUE);
		}
		else if (B == Integer.MIN_VALUE) {
			B = Integer.MAX_VALUE;
		}
		A = Math.abs(A);
		B = Math.abs(B);

		int q = 0;
		while (A >= B) {
			A = A - B;
			q++;
		}

		if (sign == -1) {
			q = -q;
		}
		System.out.println(q);
		System.out.println(A);
	}
}
