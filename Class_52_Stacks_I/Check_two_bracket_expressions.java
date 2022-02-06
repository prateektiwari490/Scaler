package Class_52_Stacks_I;

public class Check_two_bracket_expressions {

	public static void main(String[] args) {
		String A = "-(-(-(-a+b)-d+c)-q)";
		String B = "a-b-d+c+q";

		StringBuilder AA = new StringBuilder(A);
		StringBuilder BB = new StringBuilder(B);

		int flag = 0;

		for (int i = 0; i < AA.length(); i++) {
			if (AA.charAt(i) == '(') {
				if (i != 0 && AA.charAt(i - 1) == '-') {
					flag = 1;
				}
				AA.deleteCharAt(i);
			} else if (AA.charAt(i) == ')') {
				flag = 0;
				AA.deleteCharAt(i);
			} else {
				if (flag == 1) {
					if (AA.charAt(i) == '+') {
						AA.setCharAt(i, '-');
					} else if (AA.charAt(i) == '-') {
						AA.setCharAt(i, '+');
					}
				}
			}
		}
		for (int i = 0; i < BB.length(); i++) {
			if (BB.charAt(i) == '(') {
				if (i != 0 && BB.charAt(i - 1) == '-') {
					flag = 1;
				}
				BB.deleteCharAt(i);
			} else if (BB.charAt(i) == ')') {
				flag = 0;
				BB.deleteCharAt(i);
			} else {
				if (flag == 1) {
					if (BB.charAt(i) == '+') {
						BB.setCharAt(i, '-');
					} else if (BB.charAt(i) == '-') {
						BB.setCharAt(i, '+');
					}
				}
			}
		}
		System.out.println(AA);
		System.out.println(BB);
		System.out.println(AA.length());
		System.out.println(BB.length());
		
		int n = AA.length();
		int m = BB.length();
		
		if(n!=m) {
			System.out.println(0);
		}else {
			for(int i=0;i<n;i++) {
				if(AA.charAt(i) != BB.charAt(i)) {
					System.out.println(0);
				}
			}
		}
		System.out.println(1);
	}

}
