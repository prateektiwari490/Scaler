package Scaler;

import java.util.ArrayList;

public class Anti_Diagonals {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(7);
		arr.add(8);
		arr.add(9);
		A.add(arr);
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		int n = A.size();
		for(int i=0;i<n;i++) {
			int col = i,row = 0;
			ArrayList<Integer> a = new ArrayList<Integer>();
			while(col>=0) {
				a.add(A.get(row).get(col));
				row++;
				col--;
			}
			res.add(a);
		}
		
		for(int i=1;i<n;i++) {
			int col = n-1,row = i;
			ArrayList<Integer> a = new ArrayList<Integer>();
			while(row<n) {
				a.add(A.get(row).get(col));
				row++;
				col--;
			}
			res.add(a);
		}
		
		for(int i=0;i<2*n-1;i++) {
			for(int j = res.get(i).size();j<n;j++) {
				res.get(i).add(0);
			}
		}
		
		for(int i=0;i<2*n-1;i++) {
			for(int j = 0;j<res.get(i).size();j++) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
