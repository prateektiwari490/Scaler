package Class_38_Sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alternate_positive_and_negative_elements {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, -17, -100, -11);

		int n = A.size();

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (A.get(i) >= 0) {
				pos.add(A.get(i));
			} else {
				neg.add(A.get(i));
			}
		}

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < pos.size() && j < neg.size()) {
			if (k % 2 == 0) {
				ans.add(neg.get(j++));
			} else {
				ans.add(pos.get(i++));
			}
			k++;
		}

		while (j < neg.size()) {
			ans.add(neg.get(j++));
		}
		while (i < pos.size()) {
			ans.add(pos.get(i++));
		}
		
		System.out.println(ans);
	}

}
