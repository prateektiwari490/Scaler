package Class_69_Heaps_I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product_of_3 {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(11, 5, 6, 2, 8, 10);

		int n = A.size();

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				ans.add(-1);
				max1 = A.get(i);
				System.out.println(max1 + " " + max2 + " " + max3 + " 1 ");
			} else if (i == 1) {
				ans.add(-1);
				if (A.get(i) > max1) {
					max2 = max1;
					max1 = A.get(i);
				}else {
					max2 = A.get(i);
				}
				System.out.println(max1 + " " + max2 + " " + max3 + " 2 ");
			} else {
				if (A.get(i) > max1) {
					max3 = max2;
					max2 = max1;
					max1 = A.get(i);
					System.out.println(max1 + " " + max2 + " " + max3 + " if ");
				} else if (A.get(i) > max2) {
					max3 = max2;
					max2 = A.get(i);
					System.out.println(max1 + " " + max2 + " " + max3 + " else if2 ");
				} else if (A.get(i) > max3) {
					max3 = A.get(i);
					System.out.println(max1 + " " + max2 + " " + max3 + " else if3 ");
				}
				ans.add(max1 * max2 * max3);
			}

		}
		System.out.println(ans);
	}

}
