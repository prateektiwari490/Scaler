package Class_13_String_Manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class Lexicographically_Largest {

	public static void main(String[] args) {
		String A = "ittmcsvmoa_jktvvblefw";

		String[] s = A.split("_");

		StringBuilder str1 = new StringBuilder(s[0]);

		ArrayList<Character> arr = new ArrayList<>();
		for (int i = 0; i < s[1].length(); i++) {
			arr.add(s[1].charAt(i));
		}
		Collections.sort(arr, Collections.reverseOrder());

		int n = str1.length();
		int m = arr.size();
		
		int i = 0;
		int j = 0;
		while(i<n && j<m) {
			if (str1.charAt(i) < arr.get(j)) {
				str1.setCharAt(i, arr.get(j));
				i++;
				j++;
			} else {
				i++;
			}
		}

		System.out.println(str1);
	}

}
