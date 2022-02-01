package Class_28_Arrays_1;

import java.util.ArrayList;

public class Multiple_left_rotations_of_the_array {

	public static void main(String[] args) {
//		A = [1, 2, 3, 4, 5]
//	    B = [2, 3]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(2);
		B.add(3);
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		int n = A.size();
		int m = B.size();
		
		for(int l=0;l<m;l++) {
			ArrayList<Integer> arr = new ArrayList<Integer>(A);
			int k = B.get(l)%n;
			
			int i = 0;
			int j = k-1;
			
			while(i<j) {
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
				
				i++;
				j--;
			}
			
			i = k;
			j = n-1;
			
			while(i<j) {
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
				
				i++;
				j--;
			}
			
			i = 0;
			j = n-1;
			
			while(i<j) {
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
				
				i++;
				j--;
			}
			
//			for(int q=0;q<n;q++) {
//				System.out.print(arr.get(q) + " ");
//			}
//			System.out.println();
			
			res.add(arr);
			
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
