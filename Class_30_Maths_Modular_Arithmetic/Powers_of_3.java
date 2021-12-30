package Class_30_Maths_Modular_Arithmetic;

import java.util.ArrayList;
import java.util.Collections;

public class Powers_of_3 {

	public static void main(String[] args) {
		int A = 411;

		int val = 1;
		int pow = 0;
		
		while (val <= A) {
			val = (int) Math.pow(3, pow++);
		}
		val = val/3;
		pow = pow-2;
		System.out.println(Math.pow(3, pow) + " " + val);
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(A > 0) {
			int power = (int) Math.pow(3, pow);
			while(power <= A) {
				A -= power;
				ans.add(power);
				System.out.println(A);
			}
			pow--;
		}
		Collections.sort(ans);
		System.out.println(ans);
	}
}
