package Class_24_Problem_solving_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Non_decreasing_subarray_queries {

	public static void main(String[] args) {
//		A = 1, 7, 3, 4, 9
//		B = [ 
//		      [1, 2], 
//		      [2, 4]
//		    ]

		List<Integer> A = Arrays.asList(7, 7, 1, 6, 9);
		List<List<Integer>> B = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 5), Arrays.asList(1, 2),
				Arrays.asList(3, 4), Arrays.asList(1, 5));

		int n = A.size();
		int m = B.size();

		ArrayList<Integer> ans = new ArrayList<>();

		int[] PS = new int[n];

		PS[0] = 0;

		for (int i = 1; i < n; i++) {
			if (A.get(i) < A.get(i - 1)) {
				PS[i] = 1;
			} else {
				PS[i] = 0;
			}
		}
		for (int i = 1; i < n; i++) {
			PS[i] += PS[i - 1];
		}

		for (int i = 0; i < m; i++) {
			if (PS[B.get(i).get(0)-1] - PS[B.get(i).get(1)-1] == 0) {
				ans.add(1);
			} else {
				ans.add(0);
			}
		}
		System.out.println(ans);
	}

}
