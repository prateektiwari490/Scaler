package Scaler;

import java.util.ArrayList;

public class Pascal_Triangle {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		int A = 5;
		
		for(int i=0;i<A;i++) {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			for(int j=0;j<A;j++) {
				ar.add(0);
			}
			arr.add(ar);
		}
		
		for(int i=0;i<A;i++) {
			for(int j=0;j<=i;j++) {
				if(j == 0 || (i == 1 && j == 1)) {
					arr.get(i).set(j, 1);
				}else {
					arr.get(i).set(j, arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
				}
			}
		}
		for(int i=0;i<A;i++) {
			for(int j=0;j<A;j++) {
				System.out.print(arr.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
