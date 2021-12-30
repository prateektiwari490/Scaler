package Class_13_String_Manipulation;

public class Rotate_string {

	public static void main(String[] args) {
		String A = "scaler";
		int B = 2;
		
		int n = A.length();
		B = B%n;
		
		StringBuilder s = new StringBuilder(A);
		
		for(int i=0;i<n/2;i++) {
			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(n - 1 - i));
			s.setCharAt(n - 1 - i, temp);
		}
		
		System.out.println(s);
		
		int k = 0;
		int l = B;
		while(k<l) {
			char temp = s.charAt(k);
			s.setCharAt(k, s.charAt(l - 1));
			s.setCharAt(l - 1, temp);
			
			l--;
			k++;
		}
		
		System.out.println(s);
		
		k = B;
		l = n;
		while(k<l) {
			char temp = s.charAt(k);
			s.setCharAt(k, s.charAt(l - 1));
			s.setCharAt(l - 1, temp);
			
			l--;
			k++;
		}
		
		System.out.println(s);
		
	}

}
