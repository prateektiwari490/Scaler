package Class_33_Maths_Combinatorics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Next_Permutation {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52);

		int n = A.size();
		
		if(n==1) {
			System.out.println(A);
		}

		ArrayList<Integer> B = new ArrayList<>(A);
		Collections.sort(B);

		int flag = 0;
		for (int i = 0; i < n; i++) {
			if (A.get(i) != B.get(i)) {
				flag = 1;
			}
		}
		if (flag == 0) {
			Collections.sort(A, Collections.reverseOrder());
			System.out.println(A);
		}
		
		Collections.sort(B,Collections.reverseOrder());

		int flag1 = 0;
		for (int i = 0; i < n; i++) {
			if (A.get(i) != B.get(i)) {
				flag1 = 1;
			}
		}
		if (flag1 == 0) {
			Collections.sort(A);
			System.out.println(A);
		}

		int idx = -1;
		for (int i = n - 1; i > 0; i--) {
			if (A.get(i) > A.get(i - 1)) {
				int index = n - 1;
				idx = i;
				while (index > i - 1) {
					if (A.get(i - 1) < A.get(index)) {
						break;
					}
					index--;
				}
				System.out.println(A);
				int temp = A.get(i - 1);
				A.set(i - 1, A.get(index));
				A.set(index, temp);
				System.out.println(A);
				break;
			}
		}
		System.out.println(idx);
		int last = 0;
		for (int i = idx; i < (n + idx) / 2; i++) {
			int temp = A.get(i);
			A.set(i, A.get(n - last - 1));
			A.set(n - last - 1, temp);
			last++;
		}
		System.out.println(A);

	}

}
