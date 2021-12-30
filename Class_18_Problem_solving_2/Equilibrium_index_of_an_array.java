package Class_18_Problem_solving_2;

import java.util.Arrays;
import java.util.List;

public class Equilibrium_index_of_an_array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-7, 1, 5, 2, -4, 3, 0);
		
		int n = A.size();
		int sumL = 0;
		int sumR = 0;
		
		for(int i=0;i<n;i++) {
			sumR += A.get(i);
		}
		
		if(sumR - A.get(0) == 0) {
			System.out.println(0);
		}
		
		for(int i=0;i<n;i++) {
			if(sumR - sumL - A.get(i) == sumL) {
				System.out.println(i);
			}else {
				sumL += A.get(i);
			}
		}
		
	}

}
