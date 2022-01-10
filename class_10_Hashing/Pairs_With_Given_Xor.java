package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pairs_With_Given_Xor {

	public static void main(String[] args) {
//		A = [5, 4, 10, 15, 7, 6]
//		B = 5
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(4);
		A.add(10);
		A.add(15);
		A.add(7);
		A.add(6);
		
		int B = 5;
		
		Set<Integer> set = new HashSet<Integer>();
		
		int n = A.size();
		for(int i=0;i<n;i++) {
			set.add(A.get(i));
		}
		
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(set.contains(B^A.get(i))) {
				count++;
				System.out.println((B^A.get(i)) + " " + A.get(i));
			}
		}
		System.out.println(count/2);
	}

}
