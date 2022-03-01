package Class_75_Dynamic_Programming_1;

public class Ways_to_Decode {

	public static void main(String[] args) {
		String A = "2611055971756562";

		int n = A.length();
		long mod = 1000000007;
		
		int num = Character.getNumericValue(A.charAt(0));
		
		if(num == 0)
	          System.out.println(0);

		long count[] = new long[n + 1];
		count[0] = 1;
		count[1] = 1;

		for (int i = 2; i <= n; i++) {
			count[i] = 0;

			int num1 = Character.getNumericValue(A.charAt(i - 1));
			int num2 = Character.getNumericValue(A.charAt(i - 2));

			if (num1 > 0) {
				count[i] = count[i - 1];
				count[i] = count[i] % mod;
			}

			if (num2 == 1 || num2 == 2 && num1 < 7) {
				count[i] += count[i - 2];
				count[i] = count[i] % mod;
			}
		}
		System.out.println(count[n] % mod);
	}
}
