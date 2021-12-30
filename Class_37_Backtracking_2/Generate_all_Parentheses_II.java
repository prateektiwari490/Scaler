package Class_37_Backtracking_2;

import java.util.ArrayList;

public class Generate_all_Parentheses_II {

	public static void main(String[] args) {
		int A = 3;

		ArrayList<String> ans = new ArrayList<>();

		paranthesis(A, 0, 0, "", ans);
		System.out.println(ans);
	}

	private static void paranthesis(int n, int open, int close, String str, ArrayList<String> ans) {

		if (open == n && close == n) {
			ans.add(str);
			return;
		}
		if (open < n)
			paranthesis(n, open + 1, close, str + "(", ans);

		if (close < open)
			paranthesis(n, open, close + 1, str + ")", ans);
	}

}
