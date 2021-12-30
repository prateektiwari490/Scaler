package Class_20_problem_solving_4;

import java.util.ArrayList;

public class Sub_matrix_Sum_Queries {

	public static void main(String[] args) {
//		A = [   [1, 2, 3]
//		         [4, 5, 6]
//		         [7, 8, 9]   ]
//		 B = [1, 2]
//		 C = [1, 2]
//		 D = [2, 3]
//		 E = [2, 3]

		ArrayList<ArrayList<Integer>> Ar = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		Ar.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		Ar.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(7);
		arr.add(8);
		arr.add(9);
		Ar.add(arr);

		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(2);
		ArrayList<Integer> C = new ArrayList<Integer>();
		C.add(1);
		C.add(2);
		ArrayList<Integer> D = new ArrayList<Integer>();
		D.add(2);
		D.add(3);
		ArrayList<Integer> E = new ArrayList<Integer>();
		E.add(2);
		E.add(3);
		
		ArrayList<ArrayList<Long>> A = new ArrayList<ArrayList<Long>>();
		for(int i=0;i<Ar.size();i++) {
			ArrayList<Long> ar = new ArrayList<Long>();
			for(int j=0;j<Ar.get(i).size();j++) {
			    long s = (long)Ar.get(i).get(j);
			    s += 1000000007;
				s %= 1000000007;
				ar.add(s);
			}
			A.add(ar);
		}
		
		int n = A.size();
		int m = A.get(0).size();
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<m;j++) {
			    long s = A.get(i).get(j-1) + A.get(i).get(j);
			    s += 1000000007;
				s %= 1000000007;
				A.get(i).set(j, s);
			}
		}
				
		for(int j=0;j<m;j++) {
			for(int i=1;i<n;i++) {
			    long s = A.get(i-1).get(j) + A.get(i).get(j);
			    s += 1000000007;
				s %= 1000000007;
				A.get(i).set(j, s);
			}
		}
		
		int l = B.size();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int k = 0;
		while(k<l) {
			int r1 = B.get(k)-1;
			int c1 = C.get(k)-1;
			int r2 = D.get(k)-1;
			int c2 = E.get(k)-1;
			
			long x = A.get(r2).get(c2);
			if(c1>0) {
				x -= A.get(r2).get(c1-1);
				x += 1000000007;
				x %= 1000000007;
			}
			if(r1>0) {
				x -= A.get(r1-1).get(c2);
				x += 1000000007;
				x %= 1000000007;
			}
			if(r1>0 && c1 > 0) {
				x += A.get(r1-1).get(c1-1);
				x += 1000000007;
				x %= 1000000007;
			}
			ans.add((int)(x%1000000007));
			
			k++;
		}
		System.out.println(ans);
	}

}
