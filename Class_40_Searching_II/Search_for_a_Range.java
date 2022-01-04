package Class_40_Searching_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search_for_a_Range {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 7, 7, 8, 8, 10);
		int B = 8;

		int n = A.size();

		int l = 0;
		int r = n - 1;
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(-1);
		ans.add(-1);

		while (l <= r) {
			int mid = (l + r) / 2;
//			System.out.println(mid);
//			System.out.println(A.get(mid));
			if (A.get(mid) == B) {
				int i = mid;
//				System.out.println(i);
				while (i != -1 && A.get(i) == B) {
					i--;
				}
				i++;
				ans.set(0, i);
//				System.out.println(i);
//				System.out.println(A.get(i));
				while (i != n && A.get(i) == B) {
					i++;
				}
				i--;
				ans.set(1, i);
//				System.out.println(i);
				break;
			} else if (A.get(mid) > B) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(ans);
	}
}
