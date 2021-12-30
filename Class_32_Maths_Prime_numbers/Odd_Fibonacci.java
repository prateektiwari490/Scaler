package Class_32_Maths_Prime_numbers;

public class Odd_Fibonacci {

	public static void main(String[] args) {
		int A = 15;
		int B = 49;
		
		int count = B/3 - (A-1)/3;
		
		System.out.println(B-A+1-count);
	}

}
