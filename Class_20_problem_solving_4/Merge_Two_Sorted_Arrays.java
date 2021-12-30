package Class_20_problem_solving_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(4, 7, 9);
		List<Integer> B = Arrays.asList(2, 11, 19);

		int n = A.size();
		int m = B.size();
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (A.get(i) < B.get(j)) {
				ans.add(A.get(i));
				i++;
			} else {
				ans.add(B.get(j));
				j++;
			}
		}
		while (i < n) {
			ans.add(A.get(i++));
		}
		while (j < m) {
			ans.add(B.get(j++));
		}

		System.out.println(ans);
	}

}
