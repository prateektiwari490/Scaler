package Class_22_problem_solving_6;

import java.util.ArrayList;

public class Kth_Row_of_Pascals_Triangle {

	public static void main(String[] args) {
		int A = 3;
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		if(A > 1) {
			ar.add(1);
			ar.add(1);			
			for(int i=2;i<=A;i++) {
				ar.add(0);
			}
			ans = ar;
		}else {
			if(A == 1) {
				ar.add(1);
				ar.add(1);
				System.out.println(ar);
			}
			else if(A == 0) {
				ar.add(1);
				System.out.println(ar);
			}
		}
		for(int i = 2;i<=A;i++) {
			ar = new ArrayList<>(ans);
			for(int j=1;j<=A;j++) {
				ans.set(j, ar.get(j-1) + ar.get(j));
			}
		}
		System.out.println(ans);
	}

}
