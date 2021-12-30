package Class_35_Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SIXLETS {

	public static int ans = 0;

	public static void func(ArrayList<Integer> arr, int B, int sum, int count, int idx) {
	
		if(sum > 1000) {
			return;
		}
		if(count == B) {
			ans += 1;
			return;
		}
		if(idx == arr.size()) {
			return;
		}
		func(arr,B,sum+arr.get(idx),count+1,idx+1);
		func(arr,B,sum,count,idx+1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(); 
		A.add(5);
		A.add(17);
		A.add(1000);
		A.add(11);
		
		int B = 4;
		
		func(A,B,0,0,0);
		System.out.println(ans);

	}

}
