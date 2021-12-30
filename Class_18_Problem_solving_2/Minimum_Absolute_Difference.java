package Class_18_Problem_solving_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Minimum_Absolute_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 17, 100, 11);
		
		int n = A.size();
		
		Collections.sort(A);
		int min = Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			if(min > (A.get(i) - A.get(i-1))) {
				min = A.get(i) - A.get(i-1);
			}
		}
		System.out.println(min);
	}

}
