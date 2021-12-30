package class_10_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Colorful_Number {
	
	public static int prodOfNum(int num) {
		int prod = 1;
		
		while(num!=0) {
			prod *= num%10;
			num = num/10;
		}
		
		return prod;
	}

	public static void main(String[] args) {
		int A = 236;
		
		String str = String.valueOf(A);
		int n = str.length();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			for(int j = i;j<n;j++) {
				String s = str.substring(i,j+1);
//				System.out.println(s);
				int num = Integer.parseInt(s);
				int m = prodOfNum(num);
				if(set.contains(m)) {
					System.out.println(0);
				}else {
					set.add(m);
				}
			}
		}
		System.out.println(1);
		
	}

}
