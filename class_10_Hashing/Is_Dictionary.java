package class_10_Hashing;

import java.util.ArrayList;

public class Is_Dictionary {

	public static void main(String[] args) {
//		A = ["fine", "none", "no"]
//		B = "qwertyuiopasdfghjklzxcvbnm"
		
		ArrayList<String> A = new ArrayList<String>();
		A.add("fine");
		A.add("none");
		A.add("no");
		
		String B = "qwertyuiopasdfghjklzxcvbnm";
		
		int[] alpha = new int[26];
		for(int i=0;i<alpha.length;i++) {
			alpha[B.charAt(i) - 'a'] = i;
		}
		
		for(int i=0;i<A.size()-1;i++) {
			for(int j = 0;j<A.get(i).length();j++) {
				if(j >= A.get(i+1).length()) {
					System.out.println(0);
					break;
				}
				if(A.get(i).charAt(j) != A.get(i+1).charAt(j)) {
					int a = A.get(i).charAt(j) - 'a';
					int b = A.get(i+1).charAt(j) - 'a';
					
					if(alpha[a] > alpha[b]) {
						System.out.println(0);
					}else {
						break;
					}
					
				}
			}
		}
		System.out.println(1);
	}

}
