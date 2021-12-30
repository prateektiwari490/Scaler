package LeetCode;

public class Longest_Palindromic_Substring {
	
	public static int expandFromMiddle(String s, int left, int right) {
		if(s == null || left>right) {
			return 0;
		}
		while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		String A = "cbbd";
		
		if(A == null || A.length()<1) {
			System.out.println("empty String");
		}
		
		int n = A.length();
		
		int start = 0;
		int end = 0;
		
		for(int i=0;i<n;i++) {
			int len1 = expandFromMiddle(A, i, i);
			int len2 = expandFromMiddle(A, i, i+1);
			int len = Math.max(len1, len2);

			if(len > end - start) {
				start = i - (len - 1)/2;
				end = i + len/2;				
			}
		} 
		System.out.println(A.substring(start, end + 1));
	}

}
