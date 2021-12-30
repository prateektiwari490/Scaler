package Class_17_Problem_solving_1;

import java.util.ArrayList;

public class Beggars_Outside_Temple {

	public static void main(String[] args) {
		int A = 5;
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr;
		arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(10);
		B.add(arr);
		
		arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(20);
		B.add(arr);
		
		arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(25);
		B.add(arr);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<A;i++) {
			res.add(0);
		}
		
		int n = B.size();
		
		for(int i=0;i<n;i++) {
			res.set(B.get(i).get(0)-1, res.get(B.get(i).get(0)-1) + B.get(i).get(2));
			if(B.get(i).get(1) < A) {
				res.set(B.get(i).get(1), res.get(B.get(i).get(1)) - B.get(i).get(2));
			}
			System.out.println(B.get(i).get(0) + " " + B.get(i).get(1) + " " + B.get(i).get(2));
			System.out.println(res);
		}
		
		for(int i=1;i<A;i++) {
			res.set(i, res.get(i)+res.get(i-1));
		}
		
		for(int i=0;i<A;i++) {
			System.out.print(res.get(i) + " ");
		}
	}

}
