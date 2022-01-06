package Class_53_Stacks_II;

import java.util.HashMap;
import java.util.Stack;

public class Infix_to_Postfix {

	public static void main(String[] args) {
		String A = "a+b*(c^d-e)^(f+g*h)-i"; // abcd^e-fgh*+^*+i-

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('^', 1);
		map.put('/', 2);
		map.put('*', 2);
		map.put('+', 3);
		map.put('-', 3);
		for (int i = 0; i < A.length(); i++) {
			char ch = A.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				sb.append(ch);
			else if (ch == '(')
				stack.push(ch);
			else if (ch == ')') {
				while (stack.peek() != '(') {
					sb.append(stack.peek());
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) <= map.get(ch)) {
					sb.append(stack.peek());
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.peek());
			stack.pop();
		}

		System.out.println(sb.toString());
	}
}
