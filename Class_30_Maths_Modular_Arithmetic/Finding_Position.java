package Class_30_Maths_Modular_Arithmetic;

public class Finding_Position {

	public static void main(String[] args) {
		int A = 10;

		int ans = 1;
		int pow = 1;

		while (ans <= A) {
			ans = (int) (Math.pow(2, pow++));
			System.out.println(ans);
		}
		System.out.println(ans/2);
	}
}
