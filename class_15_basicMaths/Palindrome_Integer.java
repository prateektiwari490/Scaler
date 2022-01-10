package Class_15_basicMaths;

public class Palindrome_Integer {

	public static void main(String[] args) {
		int A = 2147447412;
		
		int num = A;
		String s = Integer.toString(A);
		int n = s.length();
		StringBuilder str = new StringBuilder();
		while(num!=0) {
			str.append(Integer.toString(num%10));
			num = num/10;
		}
		System.out.println(str + "\n" + s);
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=str.charAt(i)) {
				System.out.println(0);
			}
		}
		System.out.println(1);
	}

}
