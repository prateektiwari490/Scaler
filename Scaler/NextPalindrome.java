package Scaler;

public class NextPalindrome {
	
	public static void main(String[] args) {
		String str = "9";
		int len = str.length();
		String s = "";
		if(len == 1) {
			if(str.charAt(0) == '9') {
				s = s + "11";
			}else {
				int a = Character.getNumericValue(str.charAt(0))+1;
				s = s + a;
			}
		}
		else if(len == 2) {
			if(str.charAt(0) < str.charAt(1)) {
				s = s + str.charAt(1) + str.charAt(1);
			}else if(str.charAt(0) > str.charAt(1)) {
				s = s + str.charAt(0) + str.charAt(0);
			}else if(true) {
				
			}
		}
		else if(len%2 == 1) {
			for(int i=0;i<len/2;i++) {
				s = s + str.charAt(i);
			}
			if(str.charAt(len/2-1) < str.charAt(len/2+1)) {
				int a = Character.getNumericValue(str.charAt(len/2))+1;
				s = s + a;
			}
			for(int i=len/2-1;i>=0;i--) {
				s = s + str.charAt(i);
			}				
		}
		else {
			
		}
		System.out.println(s);
	}

}
