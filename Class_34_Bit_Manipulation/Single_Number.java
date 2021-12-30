package Class_34_Bit_Manipulation;

import java.util.Arrays;
import java.util.List;

public class Single_Number {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 2, 3, 1);

		int n = A.size();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = ans^A.get(i);
		}
		System.out.println(ans);
	}
}
