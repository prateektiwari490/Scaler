package Class_19_Problem_solving_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Minimum_Difference_Puzzle {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(10, 12, 10, 7, 5, 22);
		int B = 4;
		
		int n = A.size();
		Collections.sort(A);
		System.out.println(A);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n-B+1;i++) {
			if(min > A.get(i+B-1) - A.get(i)) {
				min = A.get(i+B-1) - A.get(i);
			}
		}
		System.out.println(min);
	}

}
