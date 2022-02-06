package Class_32_Maths_Prime_numbers;

public class Lucky_Numbers {

	public static void main(String[] args) {
		int A = 12;

		int[] prime = new int[A + 1];

		for (int i = 2; i <= A / 2; i++) {
			for (int j = i; j <= A; j += i) {
				if (j != i && prime[i] == 0) {
					prime[j]++;
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i <= A; i++) {
			if(prime[i] == 2) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
