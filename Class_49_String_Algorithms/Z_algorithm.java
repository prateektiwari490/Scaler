package Class_49_String_Algorithms;

public class Z_algorithm {

	public static void main(String[] args) {
		String A = "catle$cabinger";

		int n = A.length();

		int[] z = new int[n];

		int l = 0;
		int r = 0;

		z[0] = n;

		for (int i = 1; i < n; i++) {
			if (i > r) {
				l = i;
				r = i;
				while (r < n && A.charAt(r) == A.charAt(r - l)) {
					r++;
				}
				z[i] = r - l;
				r--;
			} else {
				int j = i - l;
				if (z[j] < r - i + 1) {
					z[i] = z[j];
				} else {
					l = i;
					while (r < n && A.charAt(r) == A.charAt(r - l)) {
						r++;
					}
					z[i] = r - l;
					r--;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(z[i] + " ");
		}
	}
}
