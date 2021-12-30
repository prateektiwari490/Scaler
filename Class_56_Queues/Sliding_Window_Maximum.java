package Class_56_Queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		int B = 2;

		int n = A.size();

		Deque<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (i - B >= 0) {
				if (q.getFirst() == A.get(i - B)) {
					q.removeFirst();
				}
			}
			while (!q.isEmpty() && q.getLast() < A.get(i)) {
				q.removeLast();
			}
			q.addLast(A.get(i));
			if (i >= B - 1) {
				ans.add(q.getFirst());
			}
		}
		System.out.println(ans);
	}
}
