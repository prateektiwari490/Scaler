package Class_13_String_Manipulation;

import java.util.Arrays;
import java.util.List;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		List<String> A = Arrays.asList("abcdefgh", "aefghijk", "abcefgh");
		
		int n = A.size();
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(min > A.get(i).length()) {
				min = A.get(i).length();
			}
		}
		
		String str = "";
		int j = 0;
		
		for(int i=0;i<min;i++) {
			int flag = 1;
			for(j=0;j<n-1;j++) {
				if(A.get(j).charAt(i) != A.get(j+1).charAt(i)) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				str += A.get(j).charAt(i);
			}else {
				break;
			}
		}
		
		System.out.println(str);
		
	}

}
