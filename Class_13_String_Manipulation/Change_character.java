package Class_13_String_Manipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Change_character {

	public static void main(String[] args) {
		String A = "abcabbccd";
		int B = 3;
		
		int n = A.length();
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(A.charAt(i))) {
				map.put(A.charAt(i), map.get(A.charAt(i))+1);
			}else {
				map.put(A.charAt(i), 1);
			}
		}
		
		System.out.println(map);
		
		LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println(sortedMap);
		
		if(sortedMap.get(sortedMap.keySet().toArray()[0]) > B) {
			System.out.println(sortedMap.size());
		}
		
		while(sortedMap.size() > 0) {
			if(sortedMap.get(sortedMap.keySet().toArray()[0]) <= B) {
				B = B - sortedMap.get(sortedMap.keySet().toArray()[0]);
				sortedMap.remove(sortedMap.keySet().toArray()[0]);
				System.out.println(B);
			}else {
				break;
			}
		}
		
		System.out.println(sortedMap);
		
		System.out.println(sortedMap.size());
		
	}

}
