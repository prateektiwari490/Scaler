package Class_56_Queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Reversing_Elements_Of_Queue {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
		int B = 3;

		int n = A.size();

		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			q.add(A.get(i));
		}
		
		for(int i=0;i<B;i++) {
			s.push(q.remove());
		}
		
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		
		for(int i=0;i<n-B;i++) {
			s.push(q.remove());
		}
		
		for(int i=0;i<n-B;i++) {
			q.add(s.pop());
		}
		
		for(int i=0;i<n;i++) {
			ans.add(q.remove());
		}
		
		System.out.println(ans);
		
	}

}
