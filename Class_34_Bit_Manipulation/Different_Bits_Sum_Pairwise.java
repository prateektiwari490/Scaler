package Class_34_Bit_Manipulation;

import java.util.Arrays;
import java.util.List;

public class Different_Bits_Sum_Pairwise {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 3, 5);

		int n = A.size();

		int ans = 0;

		for (int i = 0; i < 32; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if ((A.get(j) & (1 << i)) != 0) {
					count++;
				}
			}
			ans += count * (n - count) * 2;
		}
		System.out.println(ans);
	}

}
