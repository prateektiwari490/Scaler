package Class_48_Hashing_II;

import java.util.HashMap;
import java.util.Map;

public class Replicating_Substring {

	public static void main(String[] args) {
		int A = 7;
		String B = "plssefwmfhaozfyeijzxnwloiucujlpywktarroxzqnavmfexedkdqblldhuoyvmiqmchcbisqjqeowcuzmzqnkdstzgswucmgew";
		
		int n = B.length();
		Map<Character,Integer> map = new HashMap<>(); 
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(B.charAt(i))) {
				map.put(B.charAt(i), map.get(B.charAt(i))+1);
			}else {
				map.put(B.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(int i=0;i<n;i++) {
			if(map.get(B.charAt(i))%A != 0) {
				System.out.println(-1);
			}
		}
		System.out.println(1);
	}

}
