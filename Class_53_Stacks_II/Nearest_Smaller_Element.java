package Class_53_Stacks_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Nearest_Smaller_Element {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28);

		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!s.isEmpty() && s.peek() >= A.get(i)) {
				s.pop();
			}
			if (s.isEmpty()) {
				ans.add(-1);
			} else {
				ans.add(s.peek());
			}
			s.push(A.get(i));
		}
		System.out.println(ans);
	}

}
