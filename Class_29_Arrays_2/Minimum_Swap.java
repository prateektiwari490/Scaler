package Class_29_Arrays_2;

import java.util.Arrays;
import java.util.List;

public class Minimum_Swap {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 12, 10, 3, 14, 10, 5);
		int B = 8;

		int n = A.size();

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (A.get(i) <= B) {
				count++;
			}
		}
		int badcount = 0;

		for (int i = 0; i < count; i++) {
			if (A.get(i) > B) {
				badcount++;
			}
		}
		int ans = badcount;
		for (int i = count; i < n; i++) {
			if (A.get(i - count) > B) {
				badcount--;
			}
			if (A.get(i) > B) {
				badcount++;
			}
			ans = Math.min(ans, badcount);
		}

		System.out.println(ans);

	}

}
