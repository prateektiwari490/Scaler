package Scaler;

import java.util.ArrayList;

public class Rotate_Matrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		int k = 1;
		for(int i=0;i<2;i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j=0;j<2;j++) {
				arr.add(k++);
			}
			A.add(arr);
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(A.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int n = A.size();
		
		for(int i=0;i<n/2;i++) {
			int j = 0;
			while(j<n) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(n-i-1).get(j));
				A.get(n-i-1).set(j, temp);
				
				j++;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(j).get(i));
				A.get(j).set(i, temp);
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
	}

}
