package Class_39_Sorting_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game_of_Bottles {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3, 8, 17, 12, 5, 3, 14,
				13, 3, 2, 17, 19, 16, 8, 7, 12, 19, 10, 13, 8, 20, 16, 15, 4, 12, 3);

		int n = A.size();

		Collections.sort(A);

		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			}else {
				map.put(A.get(i), 1);
			}
			ans = Math.max(ans, map.get(A.get(i)));
		}
		System.out.println(ans);
	}

}
