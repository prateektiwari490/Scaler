package Class_29_Arrays_2;

import java.util.Arrays;
import java.util.List;

public class Sum_of_all_Submatrices {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));

		int n = A.size();
		int sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum += A.get(i).get(j) * (i+1) * (j+1) * (n-i) * (n-j);
			}
		}
		System.out.println(sum);
	}
}
