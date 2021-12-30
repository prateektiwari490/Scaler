package Class_18_Problem_solving_2;

import java.util.ArrayList;

public class Find_Determinant {

	public static void main(String[] args) {
//		A = [[6, 1, 1],
//		     [4, -2, 5],
//		     [2, 8, 7]]
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> res;
		
		res = new ArrayList<Integer>();
		res.add(6);
		res.add(1);
		res.add(1);
		A.add(res);
		
		res = new ArrayList<Integer>();
		res.add(4);
		res.add(-2);
		res.add(5);
		A.add(res);
		
		res = new ArrayList<Integer>();
		res.add(2);
		res.add(8);
		res.add(7);
		A.add(res);
		
		int n = A.size();
		int ans = 0;
		if(n == 3) {
			int a = A.get(0).get(0);
			int b = A.get(0).get(1);
			int c = A.get(0).get(2);
			int d = A.get(1).get(0);
			int e = A.get(1).get(1);
			int f = A.get(1).get(2);
			int g = A.get(2).get(0);
			int h = A.get(2).get(1);
			int i = A.get(2).get(2);
			
			ans = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
			
		}else if(n==2) {
			int a = A.get(0).get(0);
			int b = A.get(0).get(1);
			int c = A.get(1).get(0);
			int d = A.get(1).get(1);
			
			ans = a*d - b*c;
		}
		
		System.out.println(ans);
	
	}
}
