package Class_20_problem_solving_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5000, 5000, 5000);
		
		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(A.get(0));
		for(int i=1;i<n;i++) {
			if(A.get(i) > A.get(i-1)) {
				ans.add(A.get(i));
			}
		}
		System.out.println(ans);
	}

}
