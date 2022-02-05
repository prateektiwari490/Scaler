package Class_52_Stacks_I;

import java.util.Stack;

public class Balanced_Paranthesis {

	public static void main(String[] args) {
		String A = "{([])}";
		Stack<Character> st = new Stack<>();
        for(int i = 0; i < A.length(); i++){
                char c = A.charAt(i);
                if(c == '(')
                        st.push(c);
                else if(!st.isEmpty() && c == ')' && st.peek() == '(')
                        st.pop();
                else if(!st.isEmpty() && c == '}' && st.peek() == '{')
                        st.pop();
                else if(!st.isEmpty() && c == ']' && st.peek() == '[')
                        st.pop();
                else
                        st.push(c);
        }
        System.out.println(st.size() == 0 ? 1 : 0);
	}

}
