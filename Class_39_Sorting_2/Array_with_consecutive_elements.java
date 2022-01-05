package Class_39_Sorting_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_with_consecutive_elements {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);

		int n = A.size();

		Collections.sort(A);
		int ans = 1;
		for (int i = 0; i < n - 1; i++) {
			if (A.get(i) != A.get(i + 1) - 1) {
				ans = 0;
				break;
			}
		}
		System.out.println(ans);
	}

}
