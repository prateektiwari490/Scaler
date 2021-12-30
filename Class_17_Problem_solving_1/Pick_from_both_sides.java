package Class_17_Problem_solving_1;

import java.util.ArrayList;

public class Pick_from_both_sides {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(-2);
		A.add(3);
		A.add(1);
		A.add(2);
		
		int B = 3;
		
		int n = A.size();
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<B;i++) {
			sum += A.get(i);
		}
		max = sum;
//		System.out.println(sum);
		
		for(int i=0;i<B;i++) {
			sum -= A.get(B-1-i);
			sum += A.get(n-1-i);
			if(sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
