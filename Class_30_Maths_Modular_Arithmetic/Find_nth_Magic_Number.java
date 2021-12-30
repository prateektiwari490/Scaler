package Class_30_Maths_Modular_Arithmetic;

public class Find_nth_Magic_Number {

	public static void main(String[] args) {
		int A = 3;

		int ans = 0;
		int pow = 1;
		while (A != 0) {
			ans += (A & 1) * Math.pow(5, pow++);
			A = A >> 1;
		}
		System.out.println(ans);
	}

}
