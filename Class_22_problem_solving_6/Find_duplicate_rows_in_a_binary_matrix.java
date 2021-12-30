package Class_22_problem_solving_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Find_duplicate_rows_in_a_binary_matrix {

	public static void main(String[] args) {
//		A = [   [1, 1, 1, 0]
//	            [0, 0, 0, 1]
//	            [1, 1, 1, 0]
//	            [0, 0, 0, 1]    ]
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(1);
		ar.add(1);
		ar.add(0);
		A.add(ar);
		
		ar = new ArrayList<Integer>();
		ar.add(0);
		ar.add(0);
		ar.add(0);
		ar.add(1);
		A.add(ar);
		
		ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(1);
		ar.add(1);
		ar.add(0);
		A.add(ar);
		
//		ar = new ArrayList<Integer>();
//		ar.add(0);
//		ar.add(0);
//		ar.add(0);
//		ar.add(1);
//		A.add(ar);
		
		int n = A.size();
		
		System.out.println((long)n*(n+1)/2);
		System.out.println((long)(n*(n+1)/2));
		
		
		int m = A.get(0).size();
		
		Set<String> set = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			String str = "";
			for(int j=0;j<m;j++) {
				str += A.get(i).get(j);
			}
			if(set.contains(str)) {
				ans.add(i+1);
			}else {
				set.add(str);
			}
		}
		System.out.println(ans);
	}
}
