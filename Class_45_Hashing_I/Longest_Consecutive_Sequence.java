package Class_45_Hashing_I;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(100, 4, 200, 1, 3, 2);
		
		int n = A.size();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			set.add(A.get(i));
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(!set.contains(A.get(i) - 1)) {
				int curr = 1;
				int num = A.get(i) + 1;
				while(set.contains(num)) {
					curr++;
					num++;
				}
				if(ans < curr) {
					ans = curr;
				}
			}
			
		}
		System.out.println(ans);
		
	}

}
