package Class_30_Maths_Modular_Arithmetic;

public class Prime_Modulo_Inverse {

	public static void main(String[] args) {
		int A = 3;
		int B = 5;

		int ans = inverseMod(A, B - 2, B);
		System.out.println(ans);

	}

	private static int inverseMod(int a, int b, int p) {

		if (b == 0) {
			return 1;
		}

		if (b % 2 == 0) {
			return inverseMod((a * a) % p, b / 2, p);
		} else {
			return (a * inverseMod((a * a) % p, b / 2, p)) % p;
		}
	}

}
