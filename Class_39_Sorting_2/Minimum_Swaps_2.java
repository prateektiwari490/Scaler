package Class_39_Sorting_2;

import java.util.Arrays;
import java.util.List;

public class Minimum_Swaps_2 {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 0, 1, 3);
		
		int n = A.size();
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int index = -1;
			for(int j=i;j<n;j++) {
				if(min > A.get(j)) {
					min = A.get(j);
					index = j;
				}
			}
			if(i!=index) {
				int temp = A.get(i);
				A.set(i, A.get(index));
				A.set(index, temp);
				ans++;
			}
		}
		System.out.println(ans);
	}

}
