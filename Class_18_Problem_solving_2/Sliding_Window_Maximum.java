package Class_18_Problem_solving_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		int B = 2;

		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Deque<Integer> deque = new LinkedList<Integer>();

		int i;
		for (i = 0; i < B; i++) {
			while (!deque.isEmpty() && A.get(i) >= A.get(deque.peekLast())) {
				deque.removeLast();
			}
			deque.addLast(i);
		}

		for (; i < n; i++) {
			System.out.print(A.get(deque.peek()) + " ");
			ans.add(A.get(deque.peek()));
			while (!deque.isEmpty() && deque.peek() <= i - B) {
				deque.removeFirst();
			}
			while (!deque.isEmpty() && A.get(i) >= A.get(deque.peekLast())) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		System.out.println(A.get(deque.peek()));
		ans.add(A.get(deque.peek()));
		System.out.println(ans);
	}

}
