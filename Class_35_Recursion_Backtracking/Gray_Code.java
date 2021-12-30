package Class_35_Recursion_Backtracking;

import java.util.ArrayList;

public class Gray_Code {

	public static void main(String[] args) {
		int A = 3;
		
		ArrayList<Integer> res = new ArrayList<>();
		res.add(0);
		
		for(int i=0;i<A;i++) {
			int currSize = res.size();
			for(int j=currSize - 1;j>=0;j--) {
				res.add(res.get(j) + (1<<i));
//				System.out.println(res.get(j) + " " + (1<<i));
			}
		}
		System.out.println(res);
	}

}
