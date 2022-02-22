package Class_75_Dynamic_Programming_1;

import java.util.Arrays;
import java.util.List;

public class Max_Sum_Without_Adjacent_Elements {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(16, 5, 54, 55, 36, 82, 61, 77, 66, 61),
				Arrays.asList(31, 30, 36, 70, 9, 37, 1, 11, 68, 14));

		int n = A.get(0).size();

		int incl = Math.max(A.get(0).get(0), A.get(1).get(0));
		int excl = 0, excl_new;
		for (int i = 1; i < n; i++) {
			excl_new = Math.max(excl, incl);
			incl = excl + Math.max(A.get(0).get(i), A.get(1).get(i));
			excl = excl_new;
		}
		System.out.println(Math.max(excl, incl));

	}

}
