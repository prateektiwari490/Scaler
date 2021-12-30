package Class_31_Maths_GCD;

public class Divisor_game {
	
	static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

	public static void main(String[] args) {
		int A = 81991;
		int B = 2549;
		int C = 7;
				
		int x = B*C/gcd(B,C);
		System.out.println(A/x);
	}

}
