package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sub_array_with_0_sum {

	public static void main(String[] args) {
		ArrayList<Integer> A  = new ArrayList<Integer>();
//		A.add(7);
//		A.add(1);
//		A.add(3);
//		A.add(-2);
//		A.add(4);
		A.add(-1);
		A.add(1);
//		A.add(8);
		
		int n = A.size();
        Set<Long> set = new HashSet<>();
		long sum = 0;
		for(int i=0;i<n;i++){
		    sum += A.get(i);
		    if(sum == 0){
		        System.out.println(1);
		    }
		    if(set.contains(sum)){
		        System.out.println(1);
		    }
		    set.add(sum);
		}
		
		System.out.println(0);
		
	}

}
