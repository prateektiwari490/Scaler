package Class_45_Hashing_I;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sub_array_with_0_sum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-1, 1);
		
		int n = A.size();
		int[] PS = new int[n+1];
		PS[0] = 0;
		
		for(int i=1;i<=n;i++) {
			PS[i] = PS[i-1] + A.get(i-1);
		}
		Set<Integer> set = new HashSet<>();
		int ans = 0;
		for(int i=0;i<=n;i++) {
			if(set.contains(PS[i])) {
				ans = 1;
				break;
			}
			else {
				set.add(PS[i]);
			}
		}
		System.out.println(ans);
	}

}
