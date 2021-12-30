package Class_28_Arrays_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max_Non_Negative_SubArray {

	public static void main(String[] args) {
//		List<Integer> A = Arrays.asList(1, 2, -5, 30, -10, 4, 2, -20, 15, 15);
		List<Integer> A = Arrays.asList(1967513926, 1540383426, -1303455736, -521595368 );

		int n = A.size();

		int i = 0;
		long currSum = 0;
		long sum = 0;

		int l = 0;
		int r = 0;

		int maxl = 0;
		int maxr = 0;

		while (i < n) {
			while (i < n && A.get(i) < 0) {
				l = i+1;
				r++;
				i++;
			}
			while(i<n && A.get(i)>=0) {
				currSum += A.get(i);
				r++;
				i++;
			}
			if(currSum > sum) {
				sum = currSum;
				maxl = l;
				maxr = r-1;
			}else if(currSum == sum) {
				if(r-l > maxr-maxl) {
					maxl = l;
					maxr = r-1;
				}
			}
			System.out.println(currSum + " " + l + " " + (r-1));
			currSum = 0;
		}
		System.out.println(maxl + " " + maxr);
		ArrayList<Integer> ans = new ArrayList<>();
		for(int j = maxl;j<=maxr;j++) {
			ans.add(A.get(j));
		}
		System.out.println(ans);
	}
}
