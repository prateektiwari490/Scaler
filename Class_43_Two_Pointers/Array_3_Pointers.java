package Class_43_Two_Pointers;

import java.util.Arrays;
import java.util.List;

public class Array_3_Pointers {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 5, 6);
		List<Integer> B = Arrays.asList(2);
		List<Integer> C = Arrays.asList(3, 4);

		int n = A.size();
		int m = B.size();
		int o = C.size();

		int ans = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n && j < m && k < o) {
			int min = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
			int max = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));

			if (ans > max - min) {
				ans = max - min;
			}
			if(ans == 0) {
				break;
			}
			if (A.get(i) == min) {
				i++;
			} else if (B.get(j) == min) {
				j++;
			} else {
				k++;
			}
		}
		System.out.println(ans);
	}
}
