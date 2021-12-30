package Class_48_Hashing_II;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Points_on_same_line {
	
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 1, 4, 5, 7, -9, -8, 6);
		List<Integer> B = Arrays.asList(4, -8, -3, -2, -1, 5, 7, -4);
		
		int n = A.size();
		
		int maxpoint = 0;
		for(int i=0;i<n;i++) {
			Map<String, Integer> map = new HashMap<>();
			
			int overlap = 0;
			int currentMax = 0;
			int vertical = 1;
			int horizontal = 1;
			
			for(int j = i+1;j<n;j++) {
				
				int a = A.get(j) - A.get(i);
				int b = B.get(j) - B.get(i);
				
				if(a == 0 && b == 0) {
					overlap++;
					continue;
				}
				if(a == 0) {
					vertical++;
					continue;
				}
				if(b == 0) {
					horizontal++;
					continue;
				}
				
				
//				System.out.println(A.get(j) + " " + A.get(i) + " " + B.get(j) + " " + B.get(i));
				int gcd_ = gcd(a,b);
				String slope = b/gcd_ + "/" + a/gcd_;
				if(map.containsKey(slope)) {
					map.put(slope, map.get(slope)+1);
				}else {
					map.put(slope, 2);
				}
				
				if(currentMax < map.get(slope)) {
					currentMax = map.get(slope);
				}
			}
			maxpoint = Math.max(maxpoint, horizontal);
			maxpoint = Math.max(maxpoint, vertical);
			maxpoint = Math.max(maxpoint, currentMax + overlap);
		}
//		System.out.println(map);
		System.out.println(maxpoint);
	}

}
