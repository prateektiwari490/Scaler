package Class_15_basicMaths;

public class Sorted_Permutation_Rank {

	public static void main(String[] args) {
		String A = "bca";
		
		int n = A.length();
		double fact[] = new double[n];
		long arr[] = new long[256];
		
		fact[0] = 1;
		
		for(int i=1;i<n;i++) {
			fact[i] = (fact[i-1]*i)%1000003;		
		}
		for(int i=0;i<n;i++) {
			arr[A.charAt(i)]++;
		}
		
		int numberOfLetterSmaller = 0;
		int output = 0;
		
		for(int i=0;i<n;i++) {
			numberOfLetterSmaller = 0;
			for(int j=0;j<256;j++) {
				if(j == A.charAt(i)) {
					break;
				}
				if(arr[j] ==1) {
					numberOfLetterSmaller++;
				}
			}
			arr[A.charAt(i)] = 0;
			output += numberOfLetterSmaller * fact[n-1-i];
		}
		System.out.println((output + 1)%1000003);
	}

}
