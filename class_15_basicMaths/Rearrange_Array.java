package class_15_basicMaths;

import java.util.Arrays;
import java.util.List;

public class Rearrange_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 2, 0, 1);

		int n = A.size();

		for (int i = 0; i < n; i++) {
			A.set(i, A.get(i) + ((A.get(A.get(i)) % n) * n));
		}
		for (int i = 0; i < n; i++) {
			A.set(i, A.get(i) / n);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A.get(i) + " ");
		}

	}

}
