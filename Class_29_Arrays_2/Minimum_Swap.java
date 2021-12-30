package Class_29_Arrays_2;

import java.util.Arrays;
import java.util.List;

public class Minimum_Swap {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 12, 10, 3, 14, 10, 5);
		int B = 8;

		int n = A.size();

		int[] PS = new int[n];
		
		for (int i = 0; i < n; i++) {
			if (A.get(i) <= B) {
				PS[i] = 1;
			} else {
				PS[i] = 0;
			}
		}
		for (int i = 1; i < n; i++) {
			if (PS[i] != 0) {
				PS[i] = PS[i - 1] + 1;
			}
		}
		int sum = 0;
		int max = 0;
		int maxx = 0;
		for(int i=0;i<n;i++) {
			if(PS[i] == 0) {
				sum += max;
				max = 0;
			}else {
				max = PS[i];
			}
			
			if(maxx < max) {
				maxx = max;
			}
		}
		sum += max;
		System.out.println(sum);
		System.out.println(maxx);
		System.out.println(sum - maxx);
	}

}
