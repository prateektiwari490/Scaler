package Class_29_Arrays_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimum_Swaps_2 {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 0);

		int n = A.size();

		int ans = 0;
		ArrayList<Integer> B = new ArrayList<>(A);

		Collections.sort(B);

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(A.get(i), i);
		}
		
		for(int i=0;i<n;i++) {
			if(!A.get(i).equals(B.get(i))) {
				ans++;
				int init = A.get(i);
				
				swap(A,i,map.get(B.get(i)));
				
				map.put(init, map.get(B.get(i)));
				map.put(B.get(i), i);
				
			}
		}
		System.out.println(ans);
	}

	private static void swap(List<Integer> A, int i, int j) {
		int temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}

}
