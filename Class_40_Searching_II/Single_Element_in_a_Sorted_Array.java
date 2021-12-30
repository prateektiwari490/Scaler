package Class_40_Searching_II;

import java.util.Arrays;
import java.util.List;

public class Single_Element_in_a_Sorted_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(13, 13, 21, 21, 27, 50, 50, 102, 102, 108, 108, 110, 110, 117, 117, 120, 120,
				123, 123, 124, 124, 132, 132, 164, 164, 166, 166, 190, 190, 200, 200, 212, 212, 217, 217, 225, 225, 238,
				238, 261, 261, 276, 276, 347, 347, 348, 348, 386, 386, 394, 394, 405, 405, 426, 426, 435, 435, 474, 474,
				493, 493);

		int n = A.size();

		int start = 0;
		int end = n - 1;

		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid == 0 && !A.get(mid).equals(A.get(mid + 1))) {
				ans = A.get(mid);
				break;
			} else if (mid == n - 1 && !A.get(mid).equals(A.get(mid - 1))) {
				ans = A.get(mid);
				break;
			} else if (!A.get(mid).equals(A.get(mid - 1)) && !A.get(mid).equals(A.get(mid + 1))) {
				ans = A.get(mid);
				break;
			} else if (mid % 2 == 0 && A.get(mid).equals(A.get(mid - 1))) {
				end = mid - 1;
			} else if (mid % 2 == 1 && A.get(mid).equals(A.get(mid - 1))) {
				start = mid + 1;
			} else if (mid % 2 == 0 && !A.get(mid).equals(A.get(mid - 1))) {
				start = mid + 1;
			} else if (mid % 2 == 1 && !A.get(mid).equals(A.get(mid - 1))) {
				end = mid - 1;
			}
//			System.out.println(ans + " " + mid + " " + start + " " + end + " " + A.get(mid));
		}
		System.out.println(ans);
	}
}
