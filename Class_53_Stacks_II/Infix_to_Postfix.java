package Class_53_Stacks_II;

import java.util.HashMap;
import java.util.Stack;

public class Infix_to_Postfix {

	public static void main(String[] args) {
		String A = "a+b*(c^d-e)^(f+g*h)-i"; // abcd^e-fgh*+^*+i-

		int n = A.length();

		Stack<Character> stack = new Stack<>();

		String ans = "";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('^', 1);
		map.put('/', 2);
		map.put('*', 2);
		map.put('+', 3);
		map.put('-', 3);
		for (int i = 0; i < n; i++) {
			char ch = A.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				ans += ch;
			else if (ch == '(')
				stack.push(ch);
			else if (ch == ')') {
				while (stack.peek() != '(') {
					ans += stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) <= map.get(ch)) {
					ans += stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			ans += stack.peek();
			stack.pop();
		}
		System.out.println(ans);
	}
}
