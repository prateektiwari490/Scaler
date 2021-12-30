package Class_22_problem_solving_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xor_queries {

	public static void main(String[] args) {
//		A=[1,0,0,0,1]
//		B=[ [2,4],
//		    [1,5],
//		    [3,5] ]
		
		List<Integer> A = Arrays.asList(1,0,0,0,1);
		List<List<Integer>> B = Arrays.asList(Arrays.asList(2,4),Arrays.asList(1,5),Arrays.asList(3,5));
		
		int n = A.size();
		int m = B.size();
		
		int[] PS = new int[n];
		PS[0] = A.get(0);
		
		for(int i=1;i<n;i++) {
			PS[i] = A.get(i) + PS[i-1];
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<m;i++) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			int l = B.get(i).get(0)-1;
			int r = B.get(i).get(1)-1;
			System.out.println(l + " " + r);
			int k = PS[r] - (l == 0?0:PS[l-1]);
			System.out.println(k);
			if(k%2 == 0) {
				res.add(0);
			}else {
				res.add(1);
			}
			int cal = r-l+1;
			res.add(cal-k);
			ans.add(res);			
		}
		System.out.println(ans);
	}

}
