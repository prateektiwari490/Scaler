package Class_43_Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarray_with_given_sum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5 );
		int B = 5;

		int n = A.size();

		int start = 0;

		int sum = A.get(0);
		
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			while (sum > B && start < i - 1) {
				sum -= A.get(start);
				start++;
			}
			if (sum == B) {
				System.out.println(start + " " + (i-1));
				for (int j = start; j < i; j++) {
					ans.add(A.get(j));
				}
				break;
			}
			if (i < n) {
				sum += A.get(i);
			}
		}

		if (ans.size() == 0) {
			ans.add(-1);
		}

		System.out.println(ans);

	}

}
