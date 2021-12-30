package Class_20_problem_solving_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_Sorted_Arrays {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(10000000);
		List<Integer> B = Arrays.asList(10000000);

		int n = A.size();
		int m = B.size();
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		int j = 0;

		while (i < n && j < m) {
//			System.out.println(A.get(i) + " " + B.get(j) + " " + (A.get(i) - B.get(j) == 0));
			if (A.get(i) - B.get(j) == 0) {
				ans.add(A.get(i));
				i++;
				j++;
			} else if (A.get(i) < B.get(j)) {
				i++;
			} else if (A.get(i) > B.get(j)) {
				j++;
			}
		}

		System.out.println(ans);
	}

}
