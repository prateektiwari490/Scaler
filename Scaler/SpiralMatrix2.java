package Scaler;

import java.util.ArrayList;

public class SpiralMatrix2 {

	public static void main(String[] args) {
//		[
//		    [ 1, 2, 3 ],
//		    [ 4, 5, 6 ],
//		    [ 7, 8, 9 ]
//		]
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ar;
		ArrayList<Integer> ar1;
		ArrayList<Integer> ar2;
		ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		arr.add(ar);

		ar1 = new ArrayList<Integer>();
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		arr.add(ar1);

		ar2 = new ArrayList<Integer>();
		ar2.add(7);
		ar2.add(8);
		ar2.add(9);
		arr.add(ar2);

		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = arr.size();
		int m = arr.get(0).size();
		int i = 0;
		int r = 0, c = 0, dir = 1;
		while (i < n * m) {
			while (dir == 1) {
				if (c == n || arr.get(r).get(c) != 0) {
					c--;
					r++;
					// System.out.println("inside dir 1 and c : " + c);
					dir = 2;
				} else {
					// System.out.println(r + " " + c + " k = " + k);
					// System.out.println();
					a.add(arr.get(r).get(c++));
				}
			}
			while (dir == 2) {

				if (r == n || arr.get(r).get(c) != 0) {
					r--;
					c--;
					// System.out.println("inside dir 2 and r : " + r);
					dir = 3;
				} else {
					// System.out.println(r + " " + c + " k = " + k);
					a.add(arr.get(r++).get(c));
					// System.out.println();
				}
			}
			while (dir == 3) {

				if (c == -1 || arr.get(r).get(c) != 0) {
					c++;
					r--;
					// System.out.println("inside dir 3 and c : " + c);
					dir = 4;
				} else {
					// System.out.println(r + " " + c + " k = " + k);
					a.add(arr.get(r).get(c--));
					// System.out.println();
				}
			}
			while (dir == 4) {

				if (r == -1 || arr.get(r).get(c) != 0) {
					r++;
					c++;
					// System.out.println("inside dir 4 and r : " + r);
					dir = 1;
				} else {
					// System.out.println(r + " " + c + " k = " + k);
					a.add(arr.get(r--).get(c));
					// System.out.println();
				}
			}
		}
//        return a;
		for (int j = 0; j < n * m; j++) {
			System.out.print(a.get(j) + " ");
		}
	}

}
