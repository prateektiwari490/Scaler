package Class_41_Contest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Make_Them_Equal {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3,1,1,3);
		
		int n = A.size();
        Map<Integer,Integer> map = new TreeMap<>();
        int num = -1;
        for(int i=0;i<n;i++){
            int b = A.get(i);
            while(b >= 1) {
            	if(map.containsKey(b)){
                    map.put(b , map.get(b)+1);
                }else{
                    map.put(b , 1);
                }
            	System.out.print(b + " ");
                b = b/2;
            }
            System.out.println();
        }
        Set<Entry<Integer, Integer>> mappings = map.entrySet();
		for (Map.Entry<Integer, Integer> mapping : mappings) {
			if(mapping.getValue() == n) {
				num = mapping.getKey();
			}
		}
		System.out.println(num);
		int count = 0;
		for(int i=0;i<n;i++){
            int b = A.get(i);
            b = b/2;
            while(b >= num) {
                b = b/2;
                count++;
            }
        }
		System.out.println(count);
	}

}
