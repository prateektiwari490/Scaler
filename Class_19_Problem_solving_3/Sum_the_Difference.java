package Class_19_Problem_solving_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sum_the_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3);
		
		int n = A.size();
		int MOD = 1000000007;
		Collections.sort(A);
		long min_sum = 0, max_sum = 0;
        for (int i = 0; i < n; i++)
        {
            max_sum = 2 * max_sum + A.get(n - 1 - i);
            max_sum %= MOD;
            min_sum = 2 * min_sum + A.get(i);
            min_sum %= MOD;
        }
		System.out.println((max_sum - min_sum + MOD)%MOD);
	}
}