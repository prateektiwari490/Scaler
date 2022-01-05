package Class_43_Two_Pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pairs_with_Given_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

		int B = 0;

		int n = A.size();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			} else {
				map.put(A.get(i), 1);
			}
		}
//		System.out.println(map);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (B == 0) {
				if (!set.contains(A.get(i)) && map.get(A.get(i)) > 1) {
					count++;
				}
				set.add(A.get(i));
			} else {
				if (!set.contains(A.get(i)) && map.containsKey(B + A.get(i)) && map.get(B + A.get(i)) >= 1) {
					count++;
				}
				set.add(A.get(i));
			}
		}
		System.out.println(count);
	}
}
