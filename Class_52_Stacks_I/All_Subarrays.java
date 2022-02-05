package Class_52_Stacks_I;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class All_Subarrays {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 2, 1, 4, 3);

		int n = A.size();

		int res1 = findMaxXOR(A, n);

		Collections.reverse(A);
		
		int res2 = findMaxXOR(A, n);
		
		System.out.println(Math.max(res1, res2));

	}

	private static int findMaxXOR(List<Integer> A, int n) {
		Vector<Integer> stack = new Vector<Integer>();
		int res = 0, l = 0, i;
		for (i = 0; i < n; i++) {
			while (!stack.isEmpty() && stack.get(stack.size() - 1) < A.get(i)) {
				stack.remove(stack.size() - 1);
				l--;
			}
			stack.add(A.get(i));
			l++;
			if (l > 1) {
				res = Math.max(res, stack.get(l - 1) ^ stack.get(l - 2));
			}
		}

		return res;
	}

}
