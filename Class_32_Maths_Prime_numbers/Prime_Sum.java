package Class_32_Maths_Prime_numbers;

import java.util.ArrayList;

public class Prime_Sum {

	static boolean isPrimeNumber(int n, boolean isPrime[]) {
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= n; i++)
			isPrime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p] == true) {
				for (int i = p * p; i <= n; i += p)
					isPrime[i] = false;
			}
		}
		return false;
	}

	static ArrayList<Integer> findPrimePair(int n) {
		boolean isPrime[] = new boolean[n + 1];
		ArrayList<Integer> ans = new ArrayList<Integer>();
		isPrimeNumber(n, isPrime);
		for (int i = 0; i < n; i++) {
			if (isPrime[i] && isPrime[n - i]) {
				ans.add(i);
				ans.add(n - i);
				return ans;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int A = 12;
		System.out.println(findPrimePair(A));
	}

}
