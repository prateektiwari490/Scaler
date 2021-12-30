package Class_40_Searching_I;

import java.util.Arrays;
import java.util.List;

public class Sorted_Insert_Position {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(17, 30, 32, 69, 94, 96, 106, 118, 127, 159, 169, 170, 178, 183, 209, 238, 242,
				247, 253, 261, 265, 279, 288, 302, 305, 316, 352, 357, 374, 376, 392, 402, 410, 421, 439, 442, 444, 446,
				454, 458, 464, 467, 468, 498, 500, 513, 523, 541, 545, 556, 575, 608, 616, 629, 631, 635, 669, 674, 682,
				686, 693, 695, 719, 733, 754, 755, 756, 778, 802, 822, 824, 828, 835, 847, 848, 862, 864, 878, 883, 885,
				904, 908, 928, 934);
		int B = 104;

		int n = A.size();

		if (B > A.get(n - 1)) {
			System.out.println(n);
		}

		int start = 0, mid = 0;
		int end = n - 1;

		while (start <= end) {
			mid = start + (end - start) / 2;
			System.out.println(start + " " + end + " " + mid);
			if (A.get(mid) == B) {
				System.out.println(mid);
				break;
			} else if (B < A.get(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(mid);
	}

}
