package Class_11_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stepwise_Selection_Sort {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(6, 4, 3, 7, 2, 8);
		
		int n = A.size();
		
		ArrayList<Integer> ans = new ArrayList<>();
		int index = -1;
		
		for(int i=0;i<n-1;i++) {
			int small = Integer.MAX_VALUE;
			for(int j=i;j<n;j++) {
				if(small > A.get(j)) {
					small = A.get(j);
					index = j;
					
				}
			}
			int temp = A.get(i);
			A.set(i, A.get(index));
			A.set(index, temp);
			ans.add(index);
//			System.out.print(A + " ");
//			System.out.print(A.get(index));
//			System.out.println();
		}
//		System.out.println();
//		System.out.println(ans);
	}

}
