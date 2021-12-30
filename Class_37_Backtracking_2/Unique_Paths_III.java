package Class_37_Backtracking_2;

import java.util.Arrays;
import java.util.List;

public class Unique_Paths_III {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 0, 0, 0), Arrays.asList(0, 0, 0, 0),
				Arrays.asList(0, 0, 2, -1));

		int n = A.size();
		int m = A.get(0).size();

		int zero = 0, sx = 0, sy = 0;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				if (A.get(r).get(c) == 0) {
					zero++;
				} else if (A.get(r).get(c) == 1) {
					sx = r;
					sy = c;
				}
			}
		}
		System.out.println(dfs(A, sx, sy, zero));
	}

	private static int dfs(List<List<Integer>> a, int x, int y, int zero) {
		if (x < 0 || y < 0 || x >= a.size() || y >= a.get(0).size() || a.get(x).get(y) == -1) {
			return 0;
		}
		if (a.get(x).get(y) == 2) {
			return zero == -1 ? 1 : 0;
		}
		a.get(x).set(y, -1);
		zero--;
		int totalCount = dfs(a, x + 1, y, zero) + dfs(a, x, y + 1, zero) + dfs(a, x - 1, y, zero)
				+ dfs(a, x, y - 1, zero);

		a.get(x).set(y, 0); //  backtrack
		zero++;
		
		return totalCount;
	}

}
