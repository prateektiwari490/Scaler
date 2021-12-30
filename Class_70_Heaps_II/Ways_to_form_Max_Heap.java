package Class_70_Heaps_II;

import java.util.HashMap;
import java.util.Map;

public class Ways_to_form_Max_Heap {
	
	public static long numberOfHeaps(long n, Map<Long,Long> map) {
		if(n <= 2) {
			return 1;
		}
		
		if(map.containsKey(n)) {
			return map.get(n);
		}
		long H = (long) Math.ceil((long)((long)Math.log(n)/Math.log(2)));
		long x = (long) (Math.pow(2, H) - 1);
		
		long L = (x-1)/2 + Math.min(n-x, (x+1)/2);
		long R = (n-1) - L;
		long y = ((n-1)*(n-2))/2 * numberOfHeaps(L,map) * numberOfHeaps(R,map);
		
		map.put(n, y);
		System.out.println(map);
		return y;
	}

	public static void main(String[] args) {
		int A = 10;
		
		long ans = numberOfHeaps(A,new HashMap<Long,Long>());
		
		System.out.println(ans%1000000007);

	}

}
