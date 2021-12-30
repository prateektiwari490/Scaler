package Class_31_Maths_GCD;

import java.util.Arrays;
import java.util.List;

public class Delete_one {

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 15, 30);

		int n = A.size();
		int[] leftGCD = new int[n];
		int[] rightGCD = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				leftGCD[0] = gcd(A.get(0), 0);
			} else {
				leftGCD[i] = gcd(A.get(i), leftGCD[i - 1]);
			}
			System.out.print(leftGCD[i] + " ");
		}
		System.out.println();
		for (int i = n - 1; i >= 0; i--) {
			if (i == n - 1) {
				rightGCD[n - 1] = gcd(A.get(n - 1), 0);
			} else {
				rightGCD[i] = gcd(A.get(i), rightGCD[i + 1]);
			}
			System.out.print(rightGCD[i] + " ");
		}
		int g = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (g < rightGCD[i + 1]) {
					g = rightGCD[i + 1];
				}
			} else if (i == n - 1) {
				if (g < leftGCD[i - 1]) {
					g = leftGCD[i - 1];
				}
			} else {
				if (g < gcd(leftGCD[i - 1], rightGCD[i + 1])) {
					g = gcd(leftGCD[i - 1], rightGCD[i + 1]);
				}
			}
		}
		System.out.println(g);
	}

}
