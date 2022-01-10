package Class_10_Hashing;

import java.util.HashMap;
import java.util.Map;

public class Permutations_of_A_in_B {
	
	public static boolean equal(int[] hashA, int[] hashB) {
		
		for(int i=97;i<123;i++) {
			if(hashA[i] != hashB[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		A = "abc"
//		B = "abcbacabc"
		
//		A : "docp"
//		B : "aoapeooeoapcpaocecddoocdcqqapeapccc"
		
		String A = "abc";
		String B = "abcbacabc";
				
		int n = A.length();
		int m = B.length();
		
		int hashA[] = new int[123];
		int hashB[] = new int[123];
		
		for(int i=0;i<n;i++) {
			hashA[(int)(A.charAt(i))] += 1;
		}
		
		for(int i=0;i<n;i++) {
			hashB[(int)(B.charAt(i))] += 1;
		}
		
		int count = 0;
		
		for(int i=n,j=0;i<m;i++,j++) {
			
			if(equal(hashA, hashB)) {
				count++;
			}
			
			hashB[(int)(B.charAt(i))] += 1;
			hashB[(int)(B.charAt(j))] -= 1;
			
//			
//			for(int k=97;k<123;k++) {
//				System.out.print(hashA[k] + " ");
//			}
//			
//			System.out.println();
//			
//			for(int k=97;k<123;k++) {
//				System.out.print(hashB[k] + " ");
//			}
//			
//			System.out.println();
//			System.out.println();
//			
		}
		
		if(equal(hashA, hashB)) {
			count++;
		}
		
		System.out.println(count);
		
	}

}
