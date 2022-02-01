package Class_29_Arrays_2;

public class Flip {

	public static void main(String[] args) {
		String A = "010";

		int n = A.length();
		int L = -1, R = -1;

		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '0') {
				L = i;
				break;
			}
		}
		if (L != -1) {
			for (int i = n - 1; i >= L; i--) {
				if (A.charAt(i) == '0') {
					R = i;
					break;
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			
		}
		
	}

}
