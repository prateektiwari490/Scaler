package Class_53_Stacks_II;

import java.util.Stack;

public class Double_Character_Trouble {

	public static void main(String[] args) {
		String A = "abccbc";

		Stack<Character> stack = new Stack<Character>();
		stack.push(A.charAt(A.length() - 1));

		for (int i = A.length() - 2; i >= 0; i--) {
			if (!stack.isEmpty() && A.charAt(i) == stack.peek()) {
				stack.pop();
			} else
				stack.push(A.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.peek());
			stack.pop();
		}
//        return sb.toString();
		System.out.println(sb);
	}
}
