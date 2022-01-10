package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Equal_A_plus_B_equal_C_plus_D {

	public static void main(String[] args) {
//		A = [3, 4, 7, 1, 2, 9, 8]
//		A : [ 1, 3, 3, 3, 3, 2, 2 ]
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(2);
		A.add(2);
		
		Map<Integer,ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = A.size();
        
        for (int i=0; i<n; ++i)
        {
            for (int j=i+1; j<n; ++j)
            {
            	int sum = A.get(i) + A.get(j);
            	if(!map.containsKey(sum)) {
            		ArrayList<Integer> a = new ArrayList<Integer>();
            		a.add(i);
            		a.add(j);
            		map.put(sum, a);
            	}else {
            		ArrayList<Integer> b = new ArrayList<>();
            		b.add(map.get(sum).get(0));
            		b.add(map.get(sum).get(1));
            		
            		if(b.get(0) < i && b.get(1) != i && b.get(1)!= j) {
            			
            			ArrayList<Integer> temp = new ArrayList<Integer>();
            			temp.add(b.get(0));
            			temp.add(b.get(1));
            			temp.add(i);
            			temp.add(j);
            			
            			if(ans.size() == 0) {
            				ans = temp;
            			}else {
            				for(int t = 0;t<ans.size();t++) {
            					if(ans.get(t) < temp.get(t)) {
            						break;
            					}
            					if(ans.get(t) > temp.get(t)) {
            						ans = temp;
            						break;
            					}
            				}
            			}
            			
            		}
            		
            	}
            }
        }
        System.out.println(ans.get(0) + " " + ans.get(1) + " " + ans.get(2) + " " + ans.get(3));
	}

}
