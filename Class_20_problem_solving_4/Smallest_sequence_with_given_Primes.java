package Class_20_problem_solving_4;

import java.util.ArrayList;

public class Smallest_sequence_with_given_Primes {

	public static void main(String[] args) {
		int A = 2;
		int B = 3;
		int C = 5;
		int D = 5;
		
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(1);
		
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int count = 1;
		
		while(count <= D) {
			int x = Math.min(A * ans.get(i1), Math.min(B * ans.get(i2), C * ans.get(i3)));
			
			if(x == A * ans.get(i1)) {
				i1++;
			}
			if(x == B * ans.get(i2)) {
				i2++;
			}
			if(x == C * ans.get(i3)) {
				i3++;
			}
			if(ans.get(count - 1) < x)
			{
				System.out.println(ans.get(count-1) + " " + i1 + " " +  i2 + " " + i3);
				ans.add(x);
				count++;
			}
			
		}
		ans.remove(0);
		System.out.println(ans);
	}

}
