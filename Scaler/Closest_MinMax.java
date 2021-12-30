package Scaler;

import java.util.ArrayList;

public class Closest_MinMax {

	public static void main(String[] args) {
		// A = [-11, 7, 8, 9, 10, 11]
		// [ 0, 3, 7, 6, 4, 0, 5, 5, 5 ]
		
//		A : [ 834, 563, 606, 221, 165 ]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(834);
		A.add(563);
		A.add(606);
		A.add(221);
		A.add(165);
		
		int n = A.size();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(min > A.get(i)) {
				min = A.get(i);
			}
			if(max < A.get(i)) {
				max = A.get(i);
			}
		}
		
		System.out.println(min + " " + max);
		
		if(min == max || n == 1) {
			System.out.println(1);
		}
		
		int last_min = Integer.MIN_VALUE;
		int last_max = Integer.MIN_VALUE;
		int ans = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(A.get(i) == min) {
				ans = Math.min(ans, Math.abs(i-last_max)+1);
				System.out.println(Math.abs(i-last_max)+1);
				last_min = i;
			}if(A.get(i) == max) {
				ans = Math.min(ans, Math.abs(i-last_min)+1);
				System.out.println(Math.abs(i-last_min)+1);
				last_max = i;
			}
			
		}
		
		System.out.println(Math.abs(1- Integer.MIN_VALUE));
		
		System.out.println(ans);

	}

}
