package Class_48_Hashing_II;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Right_Triangles {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 2, 3, 3);
		List<Integer> B = Arrays.asList(1, 2, 1, 2, 1);
		
		int n = A.size();
		Map<Integer,Integer> mx = new HashMap<>();
		Map<Integer,Integer> my = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(mx.containsKey(A.get(i))) {
				mx.put(A.get(i), mx.get(A.get(i)) + 1);
			}else {
				mx.put(A.get(i), 1);
			}
		}
		for(int i=0;i<n;i++) {
			if(my.containsKey(B.get(i))) {
				my.put(B.get(i), my.get(B.get(i)) + 1);
			}else {
				my.put(B.get(i), 1);
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			int a = mx.get(A.get(i));
			int b = my.get(B.get(i));
			
			ans += ((a-1)*(b-1))%1000000007;
			
		}
		System.out.println(ans);
	}

}
