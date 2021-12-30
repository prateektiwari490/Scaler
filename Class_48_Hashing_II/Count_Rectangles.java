package Class_48_Hashing_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count_Rectangles {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 2, 2);
		List<Integer> B = Arrays.asList(1, 2, 1, 2);

		int n = A.size();
		Set<ArrayList<Integer>> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			ar.add(A.get(i));
			ar.add(B.get(i));

			set.add(ar);

		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = i + 1; j < n; j++) {
				ArrayList<Integer> ar1 = new ArrayList<Integer>();
				ar1.add(A.get(i));
				ar1.add(B.get(j));
				ArrayList<Integer> ar2 = new ArrayList<Integer>();
				ar2.add(A.get(i));
				ar2.add(B.get(j));

				if (A.get(i) != A.get(j) && B.get(i) != B.get(j)) {
					if(set.contains(ar1) && set.contains(ar2)) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
