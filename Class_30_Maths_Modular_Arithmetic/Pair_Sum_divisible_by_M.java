package Class_30_Maths_Modular_Arithmetic;

import java.util.Arrays;
import java.util.List;

public class Pair_Sum_divisible_by_M {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
		int B = 2;
		
		int n = A.size();
		
		long[]count = new long[B];
		int mod = 1000000007;
		for(int i=0;i<n;i++) {
			count[A.get(i)%B]++;
		}
		long ans = 0;
		ans = (count[0]*count[0]-1)/2;
		ans = ans%mod;
		
		int i=1;
		int j = B-1;
		
		while(i<=j) {
			if(i == j) {
				ans = (count[i]*count[i]-1)/2;
				ans = ans%mod;
			}else {
				ans = count[i]*count[j];
				ans = ans%mod;
			}
			i++;
			j--;
		}
			
		System.out.println(ans);
	}

}
