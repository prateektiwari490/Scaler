package Class_28_Arrays_1;

import java.util.Arrays;
import java.util.List;

public class Maximum_Absolute_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 3, -1);
		
		int n = A.size();
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			max1 = Math.max(max1, A.get(i) + i);
			min1 = Math.min(min1, A.get(i) + i);
			max2 = Math.max(max2, A.get(i) - i);
			min2 = Math.min(min2, A.get(i) - i);
		}
		
		System.out.println(Math.max(max1 - min1, max2 - min2));
		
	}

}
