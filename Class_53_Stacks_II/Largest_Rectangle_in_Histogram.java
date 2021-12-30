package Class_53_Stacks_II;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 1, 5, 6, 2, 3);
		
		int n = A.size();
		int max = A.get(0);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		
		int[] left_smaller = new int[n];
		int[] right_smaller = new int[n];
		
		for(int i=0;i<n;i++) {
			left_smaller[i] = -1;
			right_smaller[i] = n;
		}
		
		int i=0;
		while(i<n) {
			while(!stack.empty() && stack.peek() != -1 && A.get(i) < A.get(stack.peek())) {
				right_smaller[stack.peek()] = i;
				stack.pop();
			}
			if(i>0 && A.get(i) == A.get(i-1)) {
				left_smaller[i] = left_smaller[i-1];
			}else {
				left_smaller[i] = stack.peek();
			}
			stack.push(i);
			i++;
		}
		
		for(int j=0;j<n;j++) {
			max = Math.max(max, A.get(j)*(right_smaller[j] - left_smaller[j] - 1));
		}
		
		System.out.println(max);
		
	}

}
