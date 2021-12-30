package Class_73_Greedy_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Distribute_Candy {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 5, 2, 1);

		int n = A.size();

		int[] left = new int[n];
		int[] right = new int[n];
		int[] ans = new int[n];

		for (int i = 0; i < n; i++) {
			left[i] = 1;
			right[i] = 1;
		}
		for (int i = 1; i < n; i++) {
			if (A.get(i) > A.get(i - 1)) {
				left[i] = left[i - 1] + 1;
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			if (A.get(i) > A.get(i + 1)) {
				right[i] = right[i + 1] + 1;
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			ans[i] = Math.max(left[i], right[i]);
			sum += ans[i];
		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(left[i] + " " + right[i] + " " + ans[i]);
//		}
		System.out.println(sum);
	}

}
