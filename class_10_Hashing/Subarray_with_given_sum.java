package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Subarray_with_given_sum {

	public static void main(String[] args) {
//		A = [1, 2, 3, 4, 5]
//		B = 5

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		int B = 5;

		int n = A.size();
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int l = 0;
		int r = 1;
		long sum = A.get(0);
// 		System.out.println(sum);
		while(l<n && r<=n) {
			if(sum == B) {
			    --r;
			    for(int i = l;i<=r;i++) {
			        res.add(A.get(i));
		        }
//		        return res;
			}if(r == n){
			    break;
			}
			if(sum<B) {
				sum += A.get(r);
				r++;
			}
			if(sum>B) {
				sum -= A.get(l);
				l++;
			}
//			System.out.println(sum);
		}
		if(res.isEmpty()){
		    res.add(-1);
		}
//		return res;
	}

}
