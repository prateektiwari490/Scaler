package Class_19_Problem_solving_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contiguous_Array {

	public static void main(String[] args) {
//		1,1,1,1,0,0,1,1,0,0,0,0,1,0
		List<Integer> A = Arrays.asList(0,0,0);
		
		int n = A.size();
		for(int i=0;i<n;i++) {
			if(A.get(i) == 0) {
				A.set(i, -1);
			}
			System.out.print(A.get(i) + "  ");
		}
		System.out.println();
		
		int[] PS = new int[n+1];
		PS[0] = 0;
		System.out.print(PS[0] + "  ");
		for(int i=1;i<=n;i++) {
			PS[i] = PS[i-1] + A.get(i-1);
			System.out.print(PS[i] + "  ");
		}
		System.out.println();
		
		Map<Integer,Integer> map = new HashMap<>();
		int maxLen = Integer.MIN_VALUE;
		for(int i=0;i<=n;i++) {
			if(map.containsKey(PS[i])) {
				if(maxLen < i - map.get(PS[i])) {
					maxLen = i - map.get(PS[i]);
				}
				System.out.print(map.get(PS[i]) + "  ");
			}else {
				map.put(PS[i], i);
			}
		}
		System.out.println();
		System.out.println(maxLen == Integer.MIN_VALUE ? 0 : maxLen);
	}

}
