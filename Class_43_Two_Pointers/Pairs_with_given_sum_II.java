package Class_43_Two_Pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pairs_with_given_sum_II {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 1);
		int B = 2;

		int n = A.size();

		int ans = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(B - A.get(i))) {
				ans += map.get(B - A.get(i));
			}
			if (map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			} else {
				map.put(A.get(i), 1);
			}
		}

		System.out.println(ans);
	}

}
