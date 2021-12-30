package Class_20_problem_solving_4;

import java.util.Arrays;
import java.util.List;

public class Majority_Element {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1,2,2,3,4,4,5,6,4,4,4,4,4);
		
		int n = A.size();
		
		int ME = A.get(0);
		int count = 1;
		
		for(int i=1;i<n;i++) {
			if(ME == A.get(i)) {
				count++;
			}else {
				if(count == 0) {
					ME = A.get(i);
					count = 1;
				}else {
					count--;
				}
			}
		}
		
		int c = 0;
		for(int i=0;i<n;i++) {
			if(ME == A.get(i)) {
				c++;
			}
		}
		
		if(c > n/2) {
			System.out.println(ME);
		}
				
	}
}
