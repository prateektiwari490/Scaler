package Class_11_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Noble_Integer {

	public static void main(String[] args) {
//		A = [3, 2, 1, 3]
		List<Integer> A = Arrays.asList(3, 2, 1, 3);
		
		int n = A.size();
		
		Collections.sort(A);
		
		for(int i=0;i<n-1;i++) {
			if(A.get(i) == A.get(i+1)) {
				continue;
			}
			if(n-1-i == A.get(i)) {
				System.out.println(A.get(i) + "  "  + 1);
			}
		}
		
//		if(A.get(n-1) == n-1) {
//			System.out.println(A.get(n-1) + "  "  + 1);
//		}
//		
		System.out.println(0);
	}

}
