package Class_24_Problem_solving_8;

import java.util.Arrays;
import java.util.List;

public class Circle_of_Monsters {
	
	public static int reducedHealth(int a, int b)
	{
	    int val = a - b;
	    return Math.max(0, val);
	}

	public static void main(String[] args) {
//		A=[7,2,5]
//		B=[15,14,3]
		
		List<Integer> A = Arrays.asList(7,2,5);
		List<Integer> B = Arrays.asList(15,14,3);
		
		int n = A.size();
		int mod = 1000000000 + 7;
		
		long sum = 0;
		
		for(int i=0;i<n;i++) {
			int val = reducedHealth(A.get(i), B.get((i - 1 + n)%n));
			sum += val;
		}
		sum = sum%mod;
		
		long ans = Long.MAX_VALUE;
		for(int i=0;i<n;i++) {
			long second = reducedHealth(A.get(i), B.get((i - 1 + n)%n));
	        long first = A.get(i) + sum;
	        ans = Math.min(ans, first - second);
		}
		System.out.println((int)ans%mod);
	}
}
