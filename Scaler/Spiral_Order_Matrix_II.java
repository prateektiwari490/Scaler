package Scaler;

import java.util.ArrayList;

public class Spiral_Order_Matrix_II {

	public static void main(String[] args) {
		int A = 5;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A; i++) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			for (int j = 0; j < A; j++) {
				res.add(0);
			}
			arr.add(res);
		}

		int top = 0;
		int bottom = A - 1;
		int left = 0;
		int right = A - 1;

		int k = 1;

		while (left <= right && top <= bottom) {

			for (int i = left; i <= right; i++) {
				arr.get(top).set(i, k++);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				arr.get(i).set(right, k++);
			}
			right--;

			for (int i = right; i >= left; i--) {
				arr.get(bottom).set(i, k++);
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				arr.get(i).set(left, k++);
			}
			left++;

		}

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				System.out.print(arr.get(i).get(j) + " \t");
			}
			System.out.println();
		}

	}

}
