package Class_18_Problem_solving_2;

import java.util.ArrayList;

public class Column_Sum {

	public static void main(String[] args) {
//				[1,2,3,4]
//				[5,6,7,8]
//				[9,2,3,4]
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> res;
		
		res = new ArrayList<Integer>();
		res.add(1);
		res.add(2);
		res.add(3);
		res.add(4);
		A.add(res);
		
		res = new ArrayList<Integer>();
		res.add(5);
		res.add(6);
		res.add(7);
		res.add(8);
		A.add(res);
		
		res = new ArrayList<Integer>();
		res.add(9);
		res.add(2);
		res.add(3);
		res.add(4);
		A.add(res);
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = A.size();
		int m = A.get(0).size();
		
		for(int j=0;j<m;j++) {
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum += A.get(i).get(j);
			}
			ans.add(sum);
		}
		System.out.println(ans);
	}

}
