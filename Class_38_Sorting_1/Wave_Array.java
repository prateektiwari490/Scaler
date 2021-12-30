package Class_38_Sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wave_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 1, 3, 2, 4);

		int n = A.size();
		Collections.sort(A);

		if(n%2 == 0) {
			for(int i=0;i<n;i+=2) {
				int temp = A.get(i);
				A.set(i, A.get(i+1));
				A.set(i+1, temp);
			}
		}else {
			for(int i=0;i<n-1;i+=2) {
				int temp = A.get(i);
				A.set(i, A.get(i+1));
				A.set(i+1, temp);
			}
		}
		
		System.out.println(A);
	}

}
