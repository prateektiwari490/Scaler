package Scaler;

public class Length_of_longest_consecutive_ones {
	
	public static void main(String[] args) {
		String A = "111000";

		int numOf1 = 0;
		int n = A.length();

		int left[] = new int[n];
		int right[] = new int[n];

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '1') {
				numOf1++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '1') {
				left[i] = ++count;
			}else if(A.charAt(i) == '0') {
				count = 0;
				left[i] = 0;
			}
		}
		count = 0;
		for (int i = n-1; i >= 0; i--) {
			if (A.charAt(i) == '1') {
				right[i] = ++count;
			}else if(A.charAt(i) == '0') {
				count = 0;
				right[i] = 0;
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(A.charAt(i));
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print(left[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(right[i]);
		}
		System.out.println();
		
		int max = 0; 
		for (int i = 0; i < n; i++) {
			if(A.charAt(i) == '0') {
				if(i!=0 && i!=n-1 && (max < left[i-1] + right[i+1] + 1)) {
					max = left[i-1] + right[i+1] + 1;
				}else if(i == 0 && max < right[i+1] + 1) {
					max = right[i+1] + 1;
				}else if(i == n-1 && max < left[i-1] + 1) {
					max = left[i-1] + 1;
				}
			}
		}
		
		System.out.println(max>numOf1?numOf1:max);
	}

}
