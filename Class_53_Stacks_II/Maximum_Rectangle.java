package Class_53_Stacks_II;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Maximum_Rectangle {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(0, 0, 1), Arrays.asList(0, 1, 1), Arrays.asList(1, 1, 1));

		int n = A.size();
		int m = A.get(0).size();

		System.out.println(maxRectangle(n, m, A));

	}

	private static int maxRectangle(int n, int m, List<List<Integer>> A) {
		int res = maxHist(n, m, A.get(0));

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A.get(i).get(j) == 1) {
					A.get(i).set(j, A.get(i).get(j) + A.get(i - 1).get(j));
				}
			}
			res = Math.max(res, maxHist(n, m, A.get(i)));
		}

		return res;
	}

	private static int maxHist(int n, int m, List<Integer> list) {
		Stack<Integer> result = new Stack<>();

		int top_val;
		int max_area = 0;

		int area = 0;

		int i = 0;

		while (i < m) {
			if (result.isEmpty() || list.get(result.peek()) <= list.get(i)) {
				result.push(i++);
			} else {
				top_val = list.get(result.peek());
				result.pop();
				area = top_val * i;
				if (!result.isEmpty()) {
					area = top_val * (i - result.peek() - 1);
				}
				max_area = Math.max(area, max_area);
			}
		}

		while (!result.isEmpty()) {
			top_val = list.get(result.peek());
			result.pop();
			area = top_val * i;
			if (!result.isEmpty()) {
				area = top_val * (i - result.peek() - 1);
			}
			max_area = Math.max(area, max_area);
		}

		return max_area;
	}
}
