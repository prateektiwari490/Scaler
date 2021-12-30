package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		String A = "aab";
		
		int n = A.length();
		int i=0;
		int j=0;
		int max = 0;
		
		Set<Character> set = new HashSet<>();
		
		while(j<n) {
			if(!set.contains(A.charAt(j))) {
				set.add(A.charAt(j));
				j++;
				max = Math.max(set.size(), max);
			}else {
				set.remove(A.charAt(i));
				i++;
			}
		}
		System.out.println(max);
	}

}
