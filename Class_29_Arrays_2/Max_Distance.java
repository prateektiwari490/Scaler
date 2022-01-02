package Class_29_Arrays_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max_Distance {

	static class Pair {
		int key, value;

		Pair(int x, int y) {
			this.key = x;
			this.value = y;
		}
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 5, 4, 2);

		int n = A.size();

		List<Pair> pairList = new ArrayList<>();
		for (int i = 0; i <= n - 1; i++) {
			Pair pair = new Pair(A.get(i), i);
			pairList.add(pair);
		}
		Collections.sort(pairList, (a, b) -> a.key - b.key);

		int maxj = pairList.get(pairList.size() - 1).value;

		int ans = 0;
		for (int i = pairList.size() - 1; i >= 0; i--) {
			ans = Math.max(ans, maxj - pairList.get(i).value);
			maxj = Math.max(maxj, pairList.get(i).value);
		}

		System.out.println(ans);
	}

}
