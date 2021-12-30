package Class_40_Searching_I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Single_Element_in_a_Sorted_Array {

	public static int search(List<Integer> a) {
		int start = 0;
		int end = a.size() - 1;

		while (start + 2 < end) {
			int mid = start + (end - start) / 2;
			if (a.get(mid - 1).intValue() != a.get(mid).intValue()
					&& a.get(mid).intValue() != a.get(mid + 1).intValue()) {
				return a.get(mid).intValue();
			} else if ((mid % 2 == 1 && a.get(mid - 1).intValue() == a.get(mid).intValue())
					|| (mid % 2 == 0 && a.get(mid + 1).intValue() == a.get(mid).intValue())) {
				start = mid;
			} else {
				end = mid;
			}
		}
		// System.out.println(start + " " + end);
		if (a.get(start).intValue() == a.get(start + 1).intValue()) {
			return a.get(end).intValue();
		} else if (a.get(start + 1).intValue() != a.get(start + 2).intValue()) {
			return a.get(start + 1).intValue();
		}
		return a.get(start).intValue();
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 2, 2, 3);

		int ans = search(A);
		System.out.println(ans);
	}

}
