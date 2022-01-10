package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class two_Sum {

	public static void main(String[] args) {
//		 [2, 7, 11, 15],
		List<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(7);
		A.add(11);
		A.add(15);
		
		int B = 9;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> set = new ArrayList<>();
		int n = A.size();
		
		for(int i=0;i<n;i++) {
			if(set.contains(B-A.get(i))) {
				arr.add(set.indexOf(B-A.get(i))+1);
				arr.add(i+1);
				break;
			}else {
				set.add(A.get(i));
			}
		}
		
		System.out.println(arr.get(0) + " " + arr.get(1));
	}

}
