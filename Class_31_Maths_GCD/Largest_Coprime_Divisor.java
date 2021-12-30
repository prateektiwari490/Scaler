package Class_31_Maths_GCD;

public class Largest_Coprime_Divisor {
	
	static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

	public static void main(String[] args) {
		int A = 30;
		int B = 12;
		
		if(A == 1) {
			System.out.println(A);
		}
		
		while(gcd(A,B) != 1) {
			A = A/(gcd(A,B));
		}
		System.out.println(A);
	}

}
