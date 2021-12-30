package Class_34_Bit_Manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Single_Number_II {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);

		int n = A.size();
		ArrayList<Integer> arr = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (max < A.get(i)) {
				max = A.get(i);
			}
		}
		while (max != 0) {
			arr.add(0);
			max = max >> 1;
		}

		for (int i = 0; i < n; i++) {
			int num = A.get(i);
			for (int j = arr.size() - 1; j >= 0; j--) {
				if ((num & 1) == 1) {
					arr.set(j, arr.get(j) + 1);
				}
				num = num >> 1;
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 3 == 0) {
				arr.set(i, 0);
			} else {
				arr.set(i, 1);
			}
		}
		int C = 0;
		int p = 0;
		for (int i = arr.size() - 1; i >= 0; i--) {
			int c = arr.get(i);
			C += (int) (c * Math.pow(2, p++));
		}
		System.out.println(C);
	}

}
