package Class_11_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Is_Arithmetic_Progression {

	public static void main(String[] args) {
//		A = [3, 5, 1]
		List<Integer> A = Arrays.asList(2, 4, 1);
		
		int n = A.size();
		
		Collections.sort(A);
		
		int d = A.get(1) - A.get(0);
		
		for(int i=1;i<n;i++) {
			if(d != A.get(i) - A.get(i-1)) {
				System.out.println(0);
				break;
			}
		}
		System.out.println(1);
	}

}
