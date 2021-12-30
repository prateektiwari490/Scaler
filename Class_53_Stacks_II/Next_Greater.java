package Class_53_Stacks_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Next_Greater {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28);

		int n = A.size();

		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			if (!s.empty()) {
				while (!s.empty() && s.peek() <= A.get(i)) {
					s.pop();
				}
			}
			nge[i] = s.empty() ? -1 : s.peek();
			s.push(A.get(i));
		}
		for (int i = 0; i < n; i++)
			ans.add(nge[i]);
		System.out.println(ans);
	}

}