package Class_38_Sorting_1;

import java.util.Arrays;
import java.util.List;

public class Inversion_count_in_an_array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 2, 1);

		int n = A.size();

		int[] PS = new int[n+1];
		for(int i=0;i<=n;i++) {
			PS[i] = 0;
		}

		for(int i=1;i<n;i++) {
			if(A.get(i-1) > A.get(i)) {
				PS[i] += 1; 
			}else {
				PS[i] = PS[i-1];
			}
			System.out.println(PS[i] + " Hello");
		}
		
	}

}
