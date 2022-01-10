package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Common_Elements {

	public static void main(String[] args) {
//		A = [2, 1, 4, 10]
//		B = [3, 6, 2, 10, 10]
		
//		A = [1, 2, 2, 1]
//		B = [2, 3, 1, 2]
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(1);
		A.add(4);
//		A.add(4);
		A.add(10);
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(3);
		B.add(6);
		B.add(2);
		B.add(10);
		B.add(10);
		
		int n = A.size();
		int m = B.size();
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			}else {
				map.put(A.get(i), 1);
			}			
		}
		
		for(int i=0;i<m;i++) {
			if(map.containsKey(B.get(i)) && map.get(B.get(i)) != 0) {
				res.add(B.get(i));
				map.put(B.get(i), map.get(B.get(i)) - 1);
			}
		}
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i) + " ");
		}
	}

}
