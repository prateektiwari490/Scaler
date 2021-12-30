package Class_13_String_Manipulation;

public class Reverse_the_String_by_word {

	public static void reverseWord(StringBuilder str, int start, int end) {

		while (start <= end) {
			char temp = str.charAt(start);
			str.setCharAt(start, str.charAt(end));
			str.setCharAt(end, temp);

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";

		int n = A.length();

		StringBuilder s = new StringBuilder(A);

		for (int i = 0; i < n / 2; i++) {
			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(n - 1 - i));
			s.setCharAt(n - 1 - i, temp);
		}

		int start = 0;
		for (int end = 0; end < n; end++) {
			if (s.charAt(end) == ' ') {
				reverseWord(s, start, end-1);
				start = end + 1;
			}
		}

		reverseWord(s, start, n - 1);
		
		System.out.println(s);
		
		while(s.charAt(0) == ' ') {
			s.deleteCharAt(0);
		}
		
		while(s.charAt(s.length()-1) == ' ') {
			s.deleteCharAt(s.length()-1);
		}
		
		
		int i=0;
		while(i<s.length()) {
			while(s.charAt(i) == ' ' && s.charAt(i+1) == ' ') {
				s.deleteCharAt(i+1);
			}
			i++;
		}

		System.out.println(s);
	}

}
