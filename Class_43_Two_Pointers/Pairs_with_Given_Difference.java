package Class_43_Two_Pointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs_with_Given_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 8, 2, 8, 8, 8, 8, 4, 4, 6, 10, 10, 9, 2, 9, 3, 7);

		int B = 1;

		int n = A.size();
		Collections.sort(A);

		int count = 0;
		int l = 0;
		int r = 0;
		while (r < n) {
			if (A.get(r) - A.get(l) == B) {
				count++;
				l++;
				r++;
			} else if (A.get(r) - A.get(l) > B)
				l++;
			else // arr[r] - arr[l] < sum
				r++;
		}
		System.out.println(count);
	}
}
