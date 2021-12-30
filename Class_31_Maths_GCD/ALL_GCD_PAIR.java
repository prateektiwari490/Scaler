package Class_31_Maths_GCD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ALL_GCD_PAIR {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(46, 1, 2, 1, 1, 1, 5, 45, 1, 1, 2, 5, 1, 40, 1, 1, 1, 1, 1, 1, 1, 1, 1, 31, 1);
		
		int n = A.size();
		Collections.sort(A,Collections.reverseOrder());
		int num = (int) Math.sqrt(n);
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		while(i<num) {
			ans.add(A.get(i));
			i++;
		}
		
		System.out.println(ans);
	}

}
