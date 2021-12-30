package Class_11_Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimize_Difference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(9, 1, 2, 5, 9, 4);
		int B = 7;
		
		int n = A.size();
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			max = Math.max(max, A.get(i));
			min = Math.min(min, A.get(i));
			
			if(freqMap.containsKey(A.get(i))) {
				freqMap.put(A.get(i), freqMap.get(A.get(i)) + 1);
			}else {
				freqMap.put(A.get(i), 1);
			}
		}
		
		while(min < max && B != 0) {
			if(freqMap.get(min) < freqMap.get(max)) {
				if(B < freqMap.get(min)) {
					break;
				}
				if(freqMap.containsKey(min + 1)) {
					freqMap.put(min+1, freqMap.get(min+1) + freqMap.get(min));
				}else {
					freqMap.put(min+1, freqMap.get(min));
				}
				B = B - freqMap.get(min);
				min++;
			}else {
				if(B < freqMap.get(max)) {
					break;
				}
				if(freqMap.containsKey(max - 1)) {
					freqMap.put(max-1, freqMap.get(max-1) + freqMap.get(max));
				}else {
					freqMap.put(max-1, freqMap.get(max));
				}
				B = B - freqMap.get(max);
				max--;
			}
		}
		System.out.println(max - min);
	}
}
