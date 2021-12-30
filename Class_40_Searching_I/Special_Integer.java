package Class_40_Searching_I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Special_Integer {

	public static int func(List<Integer> A, int k, int n) {

		int ans = n;
		int sum = 0;
		int start = 0;

		for (int end = 0; end < n; end++) {
			sum += (int) A.get(end);

			while (sum > k) {
				sum -= (int) A.get(start);
				start++;

				ans = Math.min(ans, end - start + 1);

				if (sum == 0)
					break;
			}

			if (sum == 0) {
				ans = 0;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 17, 100, 11);
		int B = 130;

		int n = A.size();
		
		System.out.println(func(A, B, n));

	}

}
