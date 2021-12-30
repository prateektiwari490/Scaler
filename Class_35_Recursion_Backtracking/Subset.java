package Class_35_Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subset {
	
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

	static void subset(List<Integer> A, int i, int n, ArrayList<Integer> arr) {
		if(n == A.size()) {
//			System.out.println(arr);
			ans.add(new ArrayList<>(arr));
//			System.out.println(arr);
			return;
		}
		arr.add(A.get(i));
		
		subset(A,i+1,n+1,arr);
		arr.remove(arr.size() - 1);
		subset(A,i+1,n+1,arr);
		
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Collections.sort(A);
		subset(A, 0, 0, arr);
		Collections.sort(ans, (ArrayList<Integer> first, ArrayList<Integer> second) ->{
			for(int i=0;i< first.size() && i< second.size();i++) {
				if(first.get(i) < second.get(i)) {
					return -1;
				}
				if(first.get(i) > second.get(i)) {
					return 1;
				}
				
			}
			if(first.size() > second.size()) {
				return 1;
			}
			return -1;
		});
		
		System.out.println(ans);
	}

}
