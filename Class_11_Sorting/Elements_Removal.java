package Class_11_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Elements_Removal {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 4, 1);

		int n = A.size();

		Collections.sort(A, Collections.reverseOrder());
		
		int sum = 0;
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			sum += A.get(i);
		}
		
		for(int i=0;i<n;i++) {
			ans += sum;
			sum -= A.get(i);
		}
		
		System.out.println(ans);
		
	}

}
