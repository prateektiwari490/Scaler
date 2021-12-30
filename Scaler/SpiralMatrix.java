package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
//		[
//	    [ 1, 2, 3 ],
//	    [ 4, 5, 6 ],
//	    [ 7, 8, 9 ]
//	]

//		[[1,2,3,4],[5,6,7,8],[9,10,11,12]]

//		List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8),
//				Arrays.asList(9, 10, 11, 12));

//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> ar;
//		ar = new ArrayList<Integer>();
//		ar.add(1);
//		ar.add(2);
//		ar.add(3);
//		A.add(ar);
//
//		ar = new ArrayList<Integer>();
//		ar.add(4);
//		ar.add(5);
//		ar.add(6);
//		A.add(ar);
//
//		ar = new ArrayList<Integer>();
//		ar.add(7);
//		ar.add(8);
//		ar.add(9);
//		A.add(ar);

		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		List<Integer> result = new ArrayList<>();
		int rows = matrix.length;
		int columns = matrix[0].length;
		int up = 0;
		int left = 0;
		int right = columns - 1;
		int down = rows - 1;

		while (result.size() < rows * columns) {
			// Traverse from left to right.
			for (int col = left; col <= right; col++) {
				result.add(matrix[up][col]);
			}
			// Traverse downwards.
			for (int row = up + 1; row <= down; row++) {
				result.add(matrix[row][right]);
			}
			// Make sure we are now on a different row.
			if (up != down) {
				// Traverse from right to left.
				for (int col = right - 1; col >= left; col--) {
					result.add(matrix[down][col]);
				}
			}
			// Make sure we are now on a different column.
			if (left != right) {
				// Traverse upwards.
				for (int row = down - 1; row > up; row--) {
					result.add(matrix[row][left]);
				}
			}
			left++;
			right--;
			up++;
			down--;
		}

//		return result;
		System.out.println(result);

	}

}
