package Class_53_Stacks_II;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Evaluate_Expression {

	public static void main(String[] args) {
		List<String> A = Arrays.asList("2", "2", "/");

		int n = A.size();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (A.get(i) == "+") {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num1 + num2);
			} else if (A.get(i) == "-") {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 - num1);
			} else if (A.get(i) == "*") {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num1 * num2);
			} else if (A.get(i) == "/") {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 / num1);
			} else {
				System.out.println(A.get(i));
				int num = Integer.parseInt(A.get(i));
				
				stack.push(num);
			}
		}
		System.out.println(stack.pop());
	}

}
