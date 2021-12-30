package Class_40_Searching_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ADD_OR_NOT {

	static boolean check(int count, List<Integer> A, int B, int i, int[] prefix) {

		if (A.get(i) * count - (prefix[i + 1] - prefix[i - count + 1]) <= B) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 1, 2, 2, 1);
		int B = 3;

		int n = A.size();
		Collections.sort(A);
		int[] prefix = new int[100005];
		for (int i = 0; i < n; i++) {
			prefix[i + 1] = prefix[i] + A.get(i);
		}

		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(-1);
		ans.add(-1);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int low = 1;
			int high = i + 1;
			while (low <= high) {
				int count = (low + high) / 2;
				if (check(count, A, B, i, prefix)) {
					max = count;
					low = count + 1;
				} else {
					high = count - 1;
				}
			}
			if(ans.get(0) < max) {
				ans.set(0, max);
				ans.set(1, A.get(i));
			}
		}
		System.out.println(ans);
	}

}
