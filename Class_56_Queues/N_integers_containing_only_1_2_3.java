package Class_56_Queues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class N_integers_containing_only_1_2_3 {

	public static void main(String[] args) {
		int A = 3;

		Deque<String> q = new LinkedList<String>();
		q.add("1");
		q.add("2");
		q.add("3");

		ArrayList<Integer> ans = new ArrayList<>();
		
		if (A == 1) {
			ans.add(1);
			System.out.println(ans);
		}
		if (A == 2) {
			ans.add(1);
			ans.add(2);
			System.out.println(ans);
		}
		if (A == 3) {
			ans.add(1);
			ans.add(2);
			ans.add(3);
			System.out.println(ans);
		}
		
		ans.add(1);
		ans.add(2);
		ans.add(3);

		int i = 3;
		while (i <= A) {
			String str = q.removeFirst();
			q.add(str + "1");
			int x = Integer.parseInt(q.getLast());
			ans.add(x);
			i++;
			if(i >= A) {
				break;
			}
			q.add(str + "2");
			x = Integer.parseInt(q.getLast());
			ans.add(x);
			i++;
			if(i >= A) {
				break;
			}
			q.add(str + "3");
			x = Integer.parseInt(q.getLast());
			ans.add(x);
			i++;
			if(i >= A) {
				break;
			}
		}
		System.out.println(ans);
	}

}
