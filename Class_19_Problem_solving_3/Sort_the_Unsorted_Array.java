package Class_19_Problem_solving_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_the_Unsorted_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-146316343, 179840175, 760528516);
		
		int n = A.size();
		ArrayList<Integer> B = new ArrayList<>(A);
		System.out.println(B);
		
		Collections.sort(B);
		
		int l = 0;
		int r = n-1;
		
		for(int i=0;i<n;i++) {
			if(A.get(i)==B.get(l)) {
				l++;
			}else {
				break;
			}
//			System.out.println(A.get(i) + " " + A.get(l));
		}
		for(int i=n-1;i>=0;i--) {
			if(A.get(i)==B.get(r)) {
				r--;
			}else {
				break;
			}
//			System.out.println(A.get(i) + " " + A.get(r));
		}
		System.out.println((r - l + 1)<0?0:(r - l + 1));
	}

}
