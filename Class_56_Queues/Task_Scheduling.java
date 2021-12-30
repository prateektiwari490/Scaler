package Class_56_Queues;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Task_Scheduling {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 3, 1, 5, 4);
		List<Integer> B = Arrays.asList(1, 3, 5, 4, 2);
		
		int n = A.size();
		
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++) {
			q.add(A.get(i));
		}
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			while(B.get(i) != q.peekFirst()) {
				int temp = q.peekFirst();
				q.removeFirst();
				ans++;
				q.add(temp);
			}
			ans++;
			q.removeFirst();
		}
		
		System.out.println(ans);
	}

}
