package Class_56_Queues;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Perfect_Numbers {

	public static void main(String[] args) {
		int A = 5;
		
		Deque<String> q = new LinkedList<String>();
		q.add("1");
		q.add("2");
		
		if(A == 1) {
			System.out.println("11");
		}
		if(A == 2) {
			System.out.println("22");
		}
		int i = 3;
		String ans = "";
		while(i <= A) {
			String str = q.removeFirst();
			q.add(str + "1");
			if(i == A) {
				ans = q.getLast();
				break;
			}
			i++;
			q.add(str + "2");
			if(i == A) {
				ans = q.getLast();
				break;
			}
			i++;
//			System.out.println(q);
		}
		int n = ans.length();
		String ans1 = ans;
		for(int j=n-1;j>=0;j--) {
			ans1 += ans.charAt(j);
		}
		System.out.println(ans1);
		
	}

}
