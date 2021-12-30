package Class_18_Problem_solving_2;

import java.util.Arrays;
import java.util.List;

public class Subarray_with_least_average {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18);
		int B = 6;
		
int n = A.size();
		
		int sum = 0;
		for(int i=0;i<B;i++) {
			sum += A.get(i);
		}
		int currSum = sum;
		int index = 0;
		for(int i=B;i<n;i++) {
			currSum += A.get(i);
			currSum -= A.get(i-B);
// 			System.out.println(currSum + " " + sum);
			if(sum > currSum) {
				sum = currSum;
				index = i-B+1;
			}
		}
		System.out.println(index);
	}

}
