package Class_30_Maths_Modular_Arithmetic;

import java.util.Arrays;
import java.util.List;

public class Mod_Sum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1,2,3);
		
		int n = A.size();
		int mod = 1000000007;
		int[] count = new int[1001];
		for(int i=0;i<n;i++) {
			count[A.get(i)]++;
		}
		long ans = 0;
		for(int i=1;i<1001;i++) {
			for(int j=1;j<1001;j++) {
				int val = i%j;
				int temp = count[i]*count[j]*val;
				if(temp!=0) {
					ans = (ans%mod + temp%mod)%mod;
				}
			}
		}
		System.out.println(ans);
	}

}
