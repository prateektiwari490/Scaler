package Class_19_Problem_solving_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Optimal_Partitioning {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 1, 3, 2, 4, 3);
		
		int n = A.size();
		Collections.sort(A);
		
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++) {
			if(min > A.get(i) - A.get(i-1)) {
				min = A.get(i) - A.get(i-1);
			}
		}
		System.out.println(min);
	}

}
