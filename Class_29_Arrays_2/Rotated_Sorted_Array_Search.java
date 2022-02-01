package Class_29_Arrays_2;

import java.util.Arrays;
import java.util.List;

public class Rotated_Sorted_Array_Search {
	public static int search(final List<Integer> A, int B) {
		int l = 0;
		int h = A.size()-1;
		int mid;
		while(l<=h) {
			mid = (l+h)/2;
			if(A.get(mid) == B) {
				return mid;
			}
			else if(A.get(l) <= A.get(mid)) {
				if(B >= A.get(l) && B <= A.get(mid)) {
					h = mid - 1;
				}
				else {
					l = mid + 1;
				}
			}
			else if(A.get(mid) <= A.get(h)) {
				if(B >= A.get(mid) && B <= A.get(h)) {
					l = mid + 1;
				}
				else {
					h = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// 4, 5, 6, 7, 0, 1, 2, 3
		List<Integer> arr = Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3);

		int target = 1;
		
		int ans = search(arr, target);
		System.out.println(ans);
		
	}

}
