package Class_18_Problem_solving_2;

import java.util.Arrays;
import java.util.List;

public class Count_ways_to_make_sum_of_odd_and_even_indexed_elements_equal_by_removing_an_array_element {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1,1,1);
		
		int n = A.size();
		
		if(n == 1) {
			System.out.println(1);
		}
		
		int[] preEven = new int[n];
		int[] preOdd = new int[n];
		
		for(int i=0;i<n;i++) {
			if(i == 0) {
				preEven[i] = A.get(i);
			}else if(i%2 == 0) {
				preEven[i] = preEven[i-1] + A.get(i);
			}else {
				preEven[i] = preEven[i-1];
			}
		}
		for(int i=1;i<n;i++) {
			if(i == 1) {
				preOdd[i-1] = 0;
				preOdd[i] = A.get(i);
			}else if(i%2 == 1) {
				preOdd[i] = preOdd[i-1] + A.get(i);
			}else {
				preOdd[i] = preOdd[i-1];
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(preEven[i] + " " + preOdd[i]);
		}
		
		int count = 0;
		
		if((preEven[n-1] - preEven[0]) == (preOdd[n-1] - preOdd[0])) {
			count++;
		}
		
		for(int i=1;i<n;i++) {
			if((preEven[i-1] + preOdd[n-1] - preOdd[i]) == (preOdd[i-1] + preEven[n-1] - preEven[i])){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
