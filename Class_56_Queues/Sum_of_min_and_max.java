package Class_56_Queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Sum_of_min_and_max {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 5, -1, 7, -3, -1, -2);
		int B = 4;

		int n = A.size();

		Deque<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> max = new ArrayList<Integer>();
		ArrayList<Integer> min = new ArrayList<Integer>();
		
		int ans = 0;

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
				max.add(q.getFirst());
			}
		}
		q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			if (i - B >= 0) {
				if (q.getFirst() == A.get(i - B)) {
					q.removeFirst();
				}
			}
			while (!q.isEmpty() && q.getLast() > A.get(i)) {
				q.removeLast();
			}
			q.addLast(A.get(i));
			if (i >= B - 1) {
				min.add(q.getFirst());
			}
		}
//		System.out.println(max);
//		System.out.println(min);
		for (int i = 0; i < max.size(); i++) {
			ans += max.get(i)%1000000007 + min.get(i)%1000000007;
			ans = ans%1000000007;
		}
		System.out.println(ans%1000000007);
	}

}
