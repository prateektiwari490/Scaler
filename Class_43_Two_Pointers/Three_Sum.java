package Class_43_Two_Pointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Three_Sum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-1, 2, 1, -4);
		int B = 1;

		Collections.sort(A);
		int n = A.size();
		long min = Integer.MAX_VALUE;
		for (int k = 0; k < n-1; k++) {
			int i = k+1;
			int j = n - 1;

			while(i<j) {
				int sum = A.get(k) + A.get(i) + A.get(j);
				if(Math.abs(B - min) > Math.abs(B - sum)) {
					min = sum;
				}
				if(sum > B) {
					j--;
				}else {
					i++;
				}
			}
		}
		System.out.println(min);
	}

}
