package Class_34_Bit_Manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Min_XOR_value {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(0, 4, 7, 9);
		
		int n = A.size();
		
		Collections.sort(A);
		int min_xor = Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			min_xor = Math.min(min_xor, A.get(i-1)^A.get(i));
		}
		System.out.println(min_xor);
	}

}
