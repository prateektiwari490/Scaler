package Class_32_Maths_Prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_of_divisors {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(8, 9, 10);
		
		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int sqrt = (int)Math.sqrt(A.get(i));
			int count = 0;
			for(int j=1;j<=sqrt;j++) {
				if(A.get(i)%j == 0) {
					count++;
					if(A.get(i)/j != j) {
						count++;
					}
				}
			}
			ans.add(count);
		}
		System.out.println(ans);
	}

}
