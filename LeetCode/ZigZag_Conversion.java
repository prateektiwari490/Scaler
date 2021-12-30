package LeetCode;

public class ZigZag_Conversion {

	public static void main(String[] args) {
		String A = "PAYPALISHIRING";
		int numOfRow = 3;

		int n = A.length();
		
		if(numOfRow > n || numOfRow <= 1) {
			System.out.println(A);
		}
		
		String ans = "";
		
		int interval = 2 * numOfRow - 2;
		
		for(int i=0;i<numOfRow;i++) {
			int step = interval - 2 * i;
			for(int j = i;j<n;j += interval) {
				ans += A.charAt(j);
				if(step > 0 && step < interval && j + step < n) {
					ans += A.charAt(j + step);
				}
				System.out.println(ans);
			}
		}
		System.out.println(ans);
		
	}

}
