package Class_34_Bit_Manipulation;

import java.util.Arrays;
import java.util.List;

public class Interesting_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(9, 17);
		
		int n = A.size();
		
		for(int i=0;i<n;i++) {
			if(A.get(i)%2 == 0) {
				A.set(i, 0);
			}else {
				A.set(i, 1);
			}
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			if(A.get(i) == 1) {
				count++;
			}
		}
		System.out.println(count%2==0?"Yes":"NO");
	}

}
