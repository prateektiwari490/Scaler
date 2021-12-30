package Class_37_Backtracking_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination_Sum_II {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 4, 6, 8);
		int B = 8;

		int n = A.size();
		Collections.sort(A);
		ArrayList<Integer> current = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		// ArrayList<Integer> uniqueCandidate = new ArrayList<>();
		// for (int i = 0; i < n; i++) {
		// if (i == 0 || A.get(i) != A.get(i - 1)) {
		// uniqueCandidate.add(A.get(i));
		// }
		// }
		Set<ArrayList<Integer>> set = new HashSet<>();
		doWork(A, 0, current, 0, B, ans, set);

		for (ArrayList<Integer> num : set) {
			ans.add(num);
		}

		System.out.println(ans);

	}

	private static void doWork(List<Integer> a, int index, ArrayList<Integer> current, int currentSum, int target,
			ArrayList<ArrayList<Integer>> ans, Set<ArrayList<Integer>> set) {

		if (currentSum > target) {
			return;
		}
		if (currentSum == target) {
			set.add(new ArrayList<Integer>(current));
			return;
		}

		for (int i = index; i < a.size(); i++) {
			current.add(a.get(i));
			currentSum += a.get(i);

//			System.out.println(current);

			doWork(a, i + 1, current, currentSum, target, ans, set);

			current.remove(current.size() - 1);
			currentSum -= a.get(i);
		}

	}

}
