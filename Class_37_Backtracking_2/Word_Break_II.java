package Class_37_Backtracking_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Break_II {

	static ArrayList<String> wordBreak(String s, int start, Set<String> dict) {
		ArrayList<String> validSubstr = new ArrayList<>();

		if (start == s.length()) {
			validSubstr.add("");
		}
		for (int end = start + 1; end <= s.length(); end++) {
			String prefix = s.substring(start, end);
			if (dict.contains(prefix)) {
				List<String> suffixs = wordBreak(s, end, dict);
//				System.out.println(suffixs);
				for (String suffix : suffixs) {
					validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
				}
			}
		}

		return validSubstr;
	}

	public static void main(String[] args) {
		String A = "catsanddog";
		List<String> B = Arrays.asList("cat", "cats", "and", "sand", "dog");

		Set<String> set = new HashSet<>(B);
		System.out.println(wordBreak(A, 0, set));
	}
}
