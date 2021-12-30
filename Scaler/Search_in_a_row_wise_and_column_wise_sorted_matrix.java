package Scaler;

import java.util.ArrayList;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {

	public static void main(String[] args) {
//		A : 
//			[
//			  [2, 8, 8, 8]
//			  [2, 8, 8, 8]
//			  [2, 8, 8, 8]
//			]
//			B : 8
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(3);
//		arr.add(5);
//		arr.add(7);
//		A.add(arr);
//
//		arr = new ArrayList<Integer>();
//		arr.add(2);
//		arr.add(4);
//		arr.add(6);
//		arr.add(8);
//		A.add(arr);

		arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(8);
		arr.add(8);
		arr.add(8);
		A.add(arr);
		
		arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(8);
		arr.add(8);
		arr.add(8);
		A.add(arr);
		
		arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(8);
		arr.add(8);
		arr.add(8);
		A.add(arr);
		
		int B = 8;
		
		int row = 0;
		int n = A.size();
		int m = A.get(0).size();
		int col = m-1;
		
//		System.out.println(n + " " + m);
		
		int smallest = Integer.MAX_VALUE;
		int innerResult = Integer.MAX_VALUE;
		int result = Integer.MAX_VALUE;
		
		while(row < n && col >=0) {
			if(A.get(row).get(col) == B) {
				smallest = (row + 1) * 1009 + col + 1;
				
				for(int k=col;k>=0;k--) {
					if(A.get(row).get(k) == B) {
						innerResult = (row + 1) * 1009 + k + 1;
					}
				}
				result = Math.min(result, innerResult);
				System.out.println(result);
				break;
			}
			else if(A.get(row).get(col) < B) {
				row++;
			}else {
				col--;
			}
		}
		
		System.out.println(-1);
		
	}

}
