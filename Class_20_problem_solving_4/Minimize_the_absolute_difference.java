package Class_20_problem_solving_4;

import java.util.Arrays;
import java.util.List;

public class Minimize_the_absolute_difference {

	public static void main(String[] args) {
//		A : [ 1, 4, 5, 8, 10 ]
//				B : [ 6, 9, 15 ]
//				C : [ 2, 3, 6, 6 ]
		
		List<Integer> A = Arrays.asList(1, 4, 5, 8, 10);
		List<Integer> B = Arrays.asList(6, 9, 15);
		List<Integer> C = Arrays.asList(2, 3, 6, 6);
		
		int n = A.size();
		int m = B.size();
		int o = C.size();
		
		int diff = Integer.MAX_VALUE;
		int i=0,j=0,k=0;
		
		while(i<n && j<m && k<o) {
			int min = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
			int max = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
			
			if(max-min < diff) {
				diff = max - min;
			}
			if(min == A.get(i)) {
				i++;
			}
			if(min == B.get(j)) {
				j++;
			}
			if(min == C.get(k)) {
				k++;
			}
		}
		System.out.println(diff);
	}

}
