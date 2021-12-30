package Class_24_Problem_solving_8;

import java.util.Arrays;
import java.util.List;

public class When_will_the_ants_die {

	public static void main(String[] args) {
//		n = 4
//		left = [4,3]
//		right = [0,1]
		
		int A = 9;
		List<Integer> B = Arrays.asList(7);
		List<Integer> C = Arrays.asList(3);
		
		int left = Integer.MIN_VALUE;
		int right = Integer.MAX_VALUE;
		
		for(int i=0;i<B.size();i++) {
			if(left < B.get(i)) {
				left = B.get(i);
			}
		}
		for(int i=0;i<C.size();i++) {
			if(right > C.get(i)) {
				right = C.get(i);
			}
		}
		if(left == Integer.MIN_VALUE) {
			System.out.println(Math.abs(A-right));
		}
		if(right == Integer.MAX_VALUE) {
			System.out.println(left);
		}
		System.out.println(Math.max(left, Math.abs(A-right)));
	}

}
