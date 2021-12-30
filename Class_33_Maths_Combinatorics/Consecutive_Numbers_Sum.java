package Class_33_Maths_Combinatorics;

public class Consecutive_Numbers_Sum {

	public static void main(String[] args) {
		int A = 5;
		
		if(A == 1 && A == 2) {
			System.out.println(1);
		}
		
		int[] PS = new int[A+1];
		PS[0] = 0;
		
		for(int i=1;i<=A/2+1;i++) {
			PS[i] = PS[i-1] + 1;
		}
		for(int i=1;i<=A/2+1;i++) {
			PS[i] += PS[i-1];
		}
		int i = 1;
		int j = 1;
		int count = 0;
		
		while(i<=j && j<=A/2+1) {
			int sum = PS[j] - PS[i-1];
			if(sum == A) {
				count++;
				j++;
			}else if(sum < A) {
				j++;
			}else {
				i++;
			}
		}
		System.out.println(count+1);
	}

}
