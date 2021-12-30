package Class_49_String_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Longest_Common_Prefix {

	static String commonPrefix(String A, String B) {
		String ans = "";
		int i = 0;
		while (i < A.length() && i < B.length()) {
			if (A.charAt(i) == B.charAt(i)) {
				ans += A.charAt(i);
			} else {
				break;
			}
			i++;
		}

		return ans;
	}

	public static void main(String[] args) {
		List<String> A = Arrays.asList("cable", "cabring", "catulina");

		int n = A.size();

		String[] PS = new String[n];
		PS[0] = A.get(0);

		for (int i = 1; i < n; i++) {
			PS[i] = commonPrefix(PS[i-1],A.get(i));
		}
		System.out.println(PS[n-1]);
	}

}
