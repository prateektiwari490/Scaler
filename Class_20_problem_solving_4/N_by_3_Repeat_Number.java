package Class_20_problem_solving_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N_by_3_Repeat_Number {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 1, 1);
		
		int n = A.size();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			}else {
				map.put(A.get(i), 1);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(map.get(A.get(i)) > n/3) {
				System.out.println(A.get(i));
			}
		}
		System.out.println(-1);
	}

}
