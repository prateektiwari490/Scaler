package Scaler;

public class Min_dist_x_o_array {
	public static void main(String[] args) {
		String str = "x...o.x...o";
		int n = str.length();
		int pre[] = new int[n];
		int suf[] = new int[n];
		
		pre[0] = str.charAt(0)=='o'?0:-1;
		
		for(int i=1;i<n;i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		
		System.out.println();
		
		for(int i=1;i<n;i++) {
			
			if(str.charAt(i) == 'o') {
				pre[i] = i;
			}else {
				pre[i] = pre[i-1];
			}
			System.out.print(pre[i] + "\t");
		}
		
		System.out.println();
		
		suf[n-1] = str.charAt(n-1)=='o'?n-1:-1;
		
		for(int i=n-2;i>=0;i--) {
			if(str.charAt(i) == 'o') {
				suf[i] = i;
			}else {
				suf[i] = suf[i+1];
			}
			System.out.print(suf[i] + "\t");
		}
		System.out.println();
		
		int min_dist = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == 'x' && (pre[i]!=-1 || suf[i]!=-1)) {
				int res = ((i-pre[i])<(suf[i]-i))?(i-pre[i]):(suf[i]-i);
				System.out.println("res = " + res);
				if(min_dist > res) {
					min_dist = res;
				}
				System.out.println("min_dist = " + min_dist);
			}
		}
		if(min_dist!=Integer.MAX_VALUE) {
			System.out.println(min_dist);
		}else {
			System.out.println(-1);
		}
		
	}

}
