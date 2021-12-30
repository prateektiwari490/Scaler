package Scaler;

public class A_power_B_mod_M {
	
	static int solve(int a, int b, int m) {
		
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			return solve(a*a%m, b/2,m);
		}
		else {
			return (a*solve(a*a%m, (b-1)/2,m))%m;
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem = solve(7,996,1000);
		System.out.println(rem);
	}

}
