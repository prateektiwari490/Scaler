package class_15_basicMaths;

import java.util.HashMap;
import java.util.Map;

public class Excel_Column_Number {

	public static void main(String[] args) {
		String A = "ABCD";
		
		int n = A.length();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<26;i++) {
			map.put((char)(65 + i), i+1);
//			System.out.println((char)(65 + i) + " " + map.get((char)(65 + i)));
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			ans += map.get(A.charAt(i)) * Math.pow(26, n-1-i);
		}
		System.out.println(ans);
		
	}

}
