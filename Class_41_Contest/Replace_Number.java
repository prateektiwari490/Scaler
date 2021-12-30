package Class_41_Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Replace_Number {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 2, 5);
		List<List<Integer>> B = Arrays.asList(Arrays.asList(4, 2), Arrays.asList(2, 5), Arrays.asList(1, 3),
				Arrays.asList(2, 4));

		int n = A.size();
		int m = B.size();
		int[] map = new int[51];
		for (int i = 0; i < n; i++) {
			map[A.get(i)] =  A.get(i);
		}
		for (int i = 0; i < m; i++) {
			for(int j=1;j<51;j++) {
				if(map[j] == B.get(i).get(0)) {
					map[j] = B.get(i).get(1);
				}
			}
		}
		for (int i = 0; i < n; i++) {
				A.set(i, map[A.get(i)]);
		}
		System.out.println(A);
	}

}
