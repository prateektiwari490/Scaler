package Scaler;

import java.util.ArrayList;

public class Row_with_maximum_number_of_ones {

	public static void main(String[] args) {
//			A = [   [0, 0, 0, 0]
//		         [0, 1, 1, 1]    ]
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(0);
		arr.add(0);
		arr.add(0);
		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(0);
		arr.add(1);
		arr.add(1);
		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		A.add(arr);

		int n = A.size();
		int m = A.get(0).size();

		int j, max_row_index = 0;
		j = m - 1;

		for (int i = 0; i < n; i++) {
			while (j >= 0 && A.get(i).get(j) == 1) {
				j = j - 1; 
				max_row_index = i;
			}
		}
		if (max_row_index == 0 && A.get(0).get(m-1) == 0)
			System.out.println(-1);
		System.out.println(max_row_index);
	}
}
