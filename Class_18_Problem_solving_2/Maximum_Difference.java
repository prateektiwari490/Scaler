package Class_18_Problem_solving_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximum_Difference {
	public static void main(String[] args) {
//		A = [1, 2, 3, 4, 5]
//		B = 2
		List<Integer> A = Arrays.asList( 70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87);
		int B = 16;
		
		Collections.sort(A);
		int n = A.size();
		
		int sum = 0;
		int sumL = 0;
		int sumR = 0;
		
		for(int i=0;i<n;i++) {
			sum += A.get(i);
		}
		
		for(int i=0;i<B;i++) {
			sumL += A.get(i);
		}
		for(int i=n-B;i<n;i++) {
			sumR += A.get(i);
		}
		
		System.out.println(Math.max(Math.abs(2*sumL - sum), Math.abs(2*sumR - sum)));
		
	}
}
