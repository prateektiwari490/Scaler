package Class_11_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_by_Color {

	public static void main(String[] args) {
//		 A = [0 1 2 0 1 2]
		List<Integer> A = Arrays.asList(2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1,
				0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2,
				1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0,
				0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1,
				0, 2, 1, 2);

		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		map.put(1, 0);
		map.put(2, 0);

		for (int i = 0; i < n; i++) {
			map.put(A.get(i), map.get(A.get(i)) + 1);
//			System.out.print(map.get(A.get(i)) + "\t");
		}

//		System.out.println();
		int mapLen = map.size();

		for (int i = 0; i < mapLen; i++) {
			while (map.get(i) > 0) {
				ans.add(i);
				map.put(i, map.get(i) - 1);
			}
		}

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + "\t");
		}

	}

}
