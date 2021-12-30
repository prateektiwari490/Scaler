package Class_37_Backtracking_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 4, 6, 8);
		int B = 8;
		
		int n = A.size();
		Collections.sort(A);
		ArrayList<Integer> current = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(); 
		
		ArrayList<Integer> uniqueCandidate = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(i == 0 || A.get(i) != A.get(i-1)) {
				uniqueCandidate.add(A.get(i));
			}
		}
		
		doWork(uniqueCandidate,0,current,0,B,ans);
		
		System.out.println(ans);
		
	}

	private static void doWork(ArrayList<Integer> candidate, int index, ArrayList<Integer> current, int currentSum, int target,
			ArrayList<ArrayList<Integer>> ans) {
		
		if(currentSum > target) {
			return;
		}
		if(currentSum == target) {
			ans.add(new ArrayList<Integer>(current));
			return;
		}
		
		for(int i=index;i<candidate.size();i++) {
			current.add(candidate.get(i));
			currentSum += candidate.get(i);
			
			doWork(candidate, i, current, currentSum, target, ans);
			
			current.remove(current.size()-1);
			currentSum -= candidate.get(i);
		}
		
	}

}
