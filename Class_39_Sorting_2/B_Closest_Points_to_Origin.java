package Class_39_Sorting_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class B_Closest_Points_to_Origin {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(50, 35), Arrays.asList(6, 4), Arrays.asList(1, 26),
				Arrays.asList(35, 30), Arrays.asList(21, 14), Arrays.asList(16, 11), Arrays.asList(50, 35),
				Arrays.asList(22, 37), Arrays.asList(26, 3), Arrays.asList(96, 74), Arrays.asList(78, 63),
				Arrays.asList(82, 106), Arrays.asList(91, 107), Arrays.asList(62, 107), Arrays.asList(85, 82),
				Arrays.asList(74, 69), Arrays.asList(66, 105), Arrays.asList(109, 73), Arrays.asList(76, 108),
				Arrays.asList(63, 64), Arrays.asList(81, 104), Arrays.asList(91, 106), Arrays.asList(68, 60),
				Arrays.asList(69, 65), Arrays.asList(86, 67));

		int B = 9;

		int n = A.size();
		
		int[] distance = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        int x = A.get(i).get(0), y = A.get(i).get(1);
	        distance[i] = (x * x) + (y * y);
	    }
	    
	    Arrays.sort(distance);
	    
	    int distk = distance[B - 1];
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	    for(int i = 0; i < n; i++)
	    {
	    	int x = A.get(i).get(0), y = A.get(i).get(1);
	        int dist = (x * x) + (y * y);
	         
	        if (dist <= distk) {
	        	ArrayList<Integer> ar = new ArrayList<Integer>();
	        	ar.add(x);
	        	ar.add(y);
	            ans.add(ar);
	        }
	    }
		System.out.println(ans);
	}

}
