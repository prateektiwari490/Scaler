package Class_22_problem_solving_6;

import java.util.Arrays;
import java.util.List;

public class SUBARRAY_OR {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
		
		int n = A.size();
        int[] idx = new int[32];
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long tmp = A.get(i-1);
            for (int j = 0; j <= 31; ++j) {
                long pw = 1 << j;
                if ((tmp & pw) != 0) { //if jth bit is set
                    ans += pw * i; // add its contribution in ans for all subarrays ending at index i
                    idx[j] = i; // store the index for next elements
                } else if (idx[j] != 0) // if jth bit is not set
                {
                    ans += pw * idx[j]; // add its contribution in ans for all subarrays ending at index i using 
                } // the information of last element having jth bit set
            }
        }
        System.out.println((int)(ans % 1000000007));
		
	}

}
