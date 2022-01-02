package Class_31_Maths_GCD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ALL_GCD_PAIR {

	public static void main(String[] args) {
//		List<Integer> A = Arrays.asList(46, 1, 2, 1, 1, 1, 5, 45, 1, 1, 2, 5, 1, 40, 1, 1, 1, 1, 1, 1, 1, 1, 1, 31, 1);
		List<Integer> A = Arrays.asList(2, 2, 2, 2, 8, 2, 2, 2, 10);

		int n = A.size();
		int interval = (int) Math.sqrt(n);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int max = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (A.get(i) > max)
				max = A.get(i);
			count++;
			if (count == interval) {
				ans.add(max);
				max = 0;
				count = 0;
			}
		}
		System.out.println(ans);
	}

}
