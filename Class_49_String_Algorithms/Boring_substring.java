package Class_49_String_Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Boring_substring {

	public static void main(String[] args) {
		String A = "aab";

		int n = A.length();

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if ((int) A.charAt(i) % 2 == 0) {
				even.add((int) A.charAt(i));
			} else {
				odd.add((int) A.charAt(i));
			}
		}
		Collections.sort(even);
		Collections.sort(odd);

		if (Math.abs(odd.get(0) - even.get(even.size() - 1)) > 1
				|| Math.abs(odd.get(odd.size() - 1) - even.get(0)) > 1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
