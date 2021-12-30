package Class_22_problem_solving_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hotel_Bookings_Possible {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25,
				48, 49, 12, 7, 8);
		List<Integer> B = Arrays.asList(28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76,
				60, 90, 67, 22, 51, 53);
		int k = 23;

		int n = A.size();
		Collections.sort(A);
		Collections.sort(B);

		for(int i = 0; i < n; i++)
	    {
	        if (i + k < n && A.get(i + k) < B.get(i))
	        {
	            System.out.println(false);
	        }
	    }
		System.out.println(true);
	}
}
