package Class_28_Arrays_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class add_One_To_Number {

	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 5 );

		ArrayList<Integer> A = new ArrayList<>(ar);

		int n = A.size();
		Collections.reverse(A);
		for (int i = 0; i < n; i++) {
			if (i == n - 1 && A.get(i) == 9) {
				A.set(i, 0);
				A.add(1);
			} else if (A.get(i) == 9) {
				A.set(i, 0);
			} else {
				A.set(i, A.get(i) + 1);
				break;
			}
		}
		while(A.get(A.size()-1) == 0) {
			A.remove(A.size()-1);
		}
		Collections.reverse(A);
		System.out.println(A);
	}
}
