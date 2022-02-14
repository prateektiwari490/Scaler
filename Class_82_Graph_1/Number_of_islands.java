package Class_82_Graph_1;

import java.util.Arrays;
import java.util.List;

public class Number_of_islands {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(0, 1, 0), Arrays.asList(0, 0, 1), Arrays.asList(1, 0, 0));

		int row = A.size();
		int col = A.get(0).size();

		int count = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (A.get(i).get(j) == 1) {
					A.get(i).set(j, 0);
					count++;
					dfs(A, i + 1, j, row, col);
					dfs(A, i - 1, j, row, col);
					dfs(A, i, j + 1, row, col);
					dfs(A, i, j - 1, row, col);
					dfs(A, i + 1, j + 1, row, col);
					dfs(A, i - 1, j - 1, row, col);
					dfs(A, i + 1, j - 1, row, col);
					dfs(A, i - 1, j + 1, row, col);
				}
			}
		}
		System.out.println(count);
	}

	private static void dfs(List<List<Integer>> A, int i, int j, int row, int col) {
		if (i < 0 || j < 0 || i >= row || j >= col || A.get(i).get(j) == 0) {
			return;
		}
		if (A.get(i).get(j) == 1) {
			A.get(i).set(j, 0);
			dfs(A, i + 1, j, row, col);
			dfs(A, i - 1, j, row, col);
			dfs(A, i, j + 1, row, col);
			dfs(A, i, j - 1, row, col);
			dfs(A, i + 1, j + 1, row, col);
			dfs(A, i - 1, j - 1, row, col);
			dfs(A, i + 1, j - 1, row, col);
			dfs(A, i - 1, j + 1, row, col);
		}
	}

}
