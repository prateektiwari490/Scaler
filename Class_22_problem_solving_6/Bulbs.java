package Class_22_problem_solving_6;

import java.util.Arrays;
import java.util.List;

public class Bulbs {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(0, 1, 0, 1);

		int n = A.size();
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (A.get(i) == 0 && count % 2 == 0) {
				count++;
			} else if (A.get(i) == 1 && count % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
