package Class_56_Queues;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class First_non_repeating_character {

	public static void main(String[] args) {
		String A = "jpxvxivxkkthvpqhhhjuzhkegnzqriokhsgea";

		int n = A.length();

		Set<Character> set = new HashSet<>();
		Deque<Character> q = new LinkedList<Character>();
		q.add(A.charAt(0));
		set.add(A.charAt(0));

		StringBuilder ans = new StringBuilder();
		ans.append(A.charAt(0));
		int i = 1;
		while (i < n) {
			if (!q.isEmpty() && q.contains(A.charAt(i))) {
				q.remove(A.charAt(i));
			} else if(!set.contains(A.charAt(i))) {
				q.addFirst(A.charAt(i));
				set.add(A.charAt(i));
			}

			if (q.isEmpty()) {
//				ans += '#';
				ans.append('#');
			} else {
//				ans += q.getLast();
				ans.append(q.getLast());
			}
			i++;
		}
		System.out.println(ans);
	}

}
