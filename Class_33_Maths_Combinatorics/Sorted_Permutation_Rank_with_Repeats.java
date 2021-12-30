package Class_33_Maths_Combinatorics;

public class Sorted_Permutation_Rank_with_Repeats {

	public static void main(String[] args) {
		String A = "bbbbaaaa";

		int n = A.length();
		double fact[] = new double[n];
		long arr[] = new long[256];
		long arr1[] = new long[256];

		fact[0] = 1;

		for (int i = 1; i < n; i++) {
			fact[i] = (fact[i - 1] * i) % 1000003;
		}
		for (int i = 0; i < n; i++) {
			arr[A.charAt(i)]++;
			arr1[A.charAt(i)]++;
		}

		int numberOfLetterSmaller = 0;
		int output = 0;

		for (int i = 0; i < n; i++) {
			numberOfLetterSmaller = 0;
			for (int j = 0; j < 256; j++) {
				if (j == A.charAt(i)) {
					break;
				}
				if (arr[j] >= 1) {
					numberOfLetterSmaller++;
				}
			}
			arr[A.charAt(i)]--;
			output += numberOfLetterSmaller * fact[n - 1 - i];
		}
		
		System.out.println((output + 1) % 1000003);
	}

}
