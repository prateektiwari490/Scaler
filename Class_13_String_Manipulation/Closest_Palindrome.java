package Class_13_String_Manipulation;

public class Closest_Palindrome {

	public static void main(String[] args) {
		String A = "abbba";
		
		int n = A.length();
		
		int count = 0;
		for(int i=0;i<n/2;i++) {
			if(A.charAt(i) != A.charAt(n-i-1)) {
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println(0);
		}else if(count == 1) {
			System.out.println(1);
		}else if(count == 0) {
			if(n%2 == 0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
		
	}

}
