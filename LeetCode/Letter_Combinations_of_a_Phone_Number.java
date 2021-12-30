package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {
		String digits = "";

		List<String> ans = new ArrayList<>();

		if (digits.length() == 0) {
			System.out.println(ans);
		}

		Map<Character, String> hm = new HashMap<>();
		hm.put('2', "abc");
		hm.put('3', "def");
		hm.put('4', "ghi");
		hm.put('5', "jkl");
		hm.put('6', "mno");
		hm.put('7', "pqrs");
		hm.put('8', "tuv");
		hm.put('9', "wxyz");

		solve(digits, 0, hm, new StringBuilder(), ans);
		System.out.println(ans);
	}

	private static void solve(String digits, int i, Map<Character, String> hm, StringBuilder stringBuilder,
			List<String> ans) {
		if (i == digits.length()) {
			ans.add(stringBuilder.toString());
			return;
		}
		String curr = hm.get(digits.charAt(i));
//		System.out.println(curr);
		for (int k = 0; k < curr.length(); k++) {
			stringBuilder.append(curr.charAt(k));
			solve(digits, i + 1, hm, stringBuilder, ans);
			stringBuilder.deleteCharAt(stringBuilder.length()-1);
		}
	}

}
