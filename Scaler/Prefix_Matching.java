package Scaler;

import java.util.ArrayList;

public class Prefix_Matching {

	public static void main(String[] args) {
//		A = [a, aa, aab, b, bb, bba, bbb]
//		B = bb
		ArrayList<String> A = new ArrayList<>();
		A.add("a");
		A.add("b");
//		A.add("aab");
//		A.add("b");
//		A.add("bb");
//		A.add("bba");
//		A.add("bbb");
		
		String B = "c";
		
		ArrayList<Integer> res = new ArrayList<>();
		
		int n = A.size();
		int m = B.length();
		int firstIndex = -1;
		int lastIndex = -1;
		for(int i=0;i<n;i++) {
//			System.out.println(A.get(i).length());
			if(A.get(i).length() >= m) {
				if(B.equals(A.get(i).substring(0,m))) {
					firstIndex = i;
					break;
				}
			}
		}
		for(int i=n-1;i>=0;i--) {
			if(A.get(i).length() >= m) {
				if(B.equals(A.get(i).substring(0,m))) {
					lastIndex = i;
					break;
				}
			}			
		}
		res.add(firstIndex);
		res.add(lastIndex);
		
//		return res;
		System.out.println(res.get(0) + " " + res.get(1));
		
	}

}
