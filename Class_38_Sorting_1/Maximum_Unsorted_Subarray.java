package Class_38_Sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximum_Unsorted_Subarray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);

		int n = A.size();
		ArrayList<Integer> arr = new ArrayList<>(A);
		ArrayList<Integer> ans = new ArrayList<>();

		Collections.sort(arr);

		for (int i = 0; i < n; i++) {
			if (A.get(i) != arr.get(i)) {
				ans.add(i);
				break;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			if (A.get(i) != arr.get(i)) {
				ans.add(i);
				break;
			}
		}
		System.out.println(ans);
		if(ans.isEmpty()) {
			ans.add(-1);
		}
		System.out.println(ans);
	}

}
