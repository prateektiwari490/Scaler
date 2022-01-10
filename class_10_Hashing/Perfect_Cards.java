package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Perfect_Cards {

	public static void main(String[] args) {
//		A = [1, 1, 2, 2, 3]
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
//		A.add(3);
		
int n = A.size();
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i))+1);
			}else {
				map.put(A.get(i), 1);
			}
		}
		
		if(map.size() == 2) {
			for(Map.Entry<Integer, Integer> m:map.entrySet()) {
				res.add(m.getValue());
			}
		}
		// use it in competitive coding...
//		return res.size()==2 && res.get(0)==res.get(1)?"WIN":"LOSE";
	}

}
