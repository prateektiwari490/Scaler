package Class_39_Sorting_2;

import java.util.Arrays;
import java.util.List;

public class Max_Chunks_To_Make_Sorted {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 0, 1, 3 );
		
		int n = A.size();
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max = Math.max(max, A.get(i));
			if(max == i) {
				count++;
			}
		}
		System.out.println(count);
	}

}
