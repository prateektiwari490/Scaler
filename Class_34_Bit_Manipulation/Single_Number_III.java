package Class_34_Bit_Manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single_Number_III {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 1, 2, 5);

		int n = A.size();

		int xor = 0;

		for (int i = 0; i < n; i++) {
			xor ^= A.get(i);
		}
		int setBit = 0;

		while ((xor & 1) == 0) {
			xor = xor >> 1;
			setBit++;
		}
		int first = 0;
		int second = 0;
		
		for(int i=0;i<n;i++) {
			if(((A.get(i)>>setBit)&1) == 0) {
				first ^= A.get(i);
			}else {
				second ^= A.get(i);
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(first);
		ans.add(second);
		Collections.sort(ans);
		System.out.println(ans);
	}

}
