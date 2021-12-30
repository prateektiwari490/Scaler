package Class_40_Searching_I;

import java.util.Arrays;
import java.util.List;

public class Matrix_Search {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 3, 5, 7), Arrays.asList(10, 11, 16, 20),
				Arrays.asList(23, 30, 34, 50));
		int B = 24;
		
		int n = A.size();
		int m = A.get(0).size();
		
		int i=0;
		int j = m-1;
		
		while(i < n && j>=0) {
			if(B == A.get(i).get(j)) {
				System.out.println("found");
				break;
			}
			if(B < A.get(i).get(j)) {
				j--;
			}
			if(B > A.get(i).get(j)) {
				i++;
			}
		}
		System.out.println("found");
	}

}
