package Class_28_Arrays_1;

import java.util.Arrays;
import java.util.List;

public class Max_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-500);
		
		int n = A.size();
		
		
		int sum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i=0;i<n;i++) {
			currSum += A.get(i);
			if(sum < currSum) {
				sum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		System.out.println(sum);
	}

}
