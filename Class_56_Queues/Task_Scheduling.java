package Class_56_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Task_Scheduling {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 3, 1, 5, 4);
		List<Integer> B = Arrays.asList(1, 3, 5, 4, 2);

		int n = A.size();

		Deque<Integer> deque = new ArrayDeque<>();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			deque.addLast(A.get(i));
		}

		for (int i = 0; i < n; i++) {
			while (B.get(i) != deque.peekFirst()) {
				int temp = deque.peekFirst();
				deque.removeFirst();
				ans++;
				deque.addLast(temp);
			}
			ans++;
			deque.removeFirst();
		}

		System.out.println(ans);
	}

}
