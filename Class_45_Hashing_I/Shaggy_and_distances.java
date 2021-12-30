package Class_45_Hashing_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shaggy_and_distances {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(7, 1, 3, 4, 1, 7);
		
		int n = A.size();
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(map.containsKey(A.get(i))) {
				if(ans > i - map.get(A.get(i))) {
					ans = i - map.get(A.get(i));
				}
			}
			map.put(A.get(i), i);
		}
		System.out.println(ans);
	}

}
