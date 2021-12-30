package Class_31_Maths_GCD;

import java.util.Arrays;
import java.util.List;

public class Pubg {
	
	static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
	
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 3, 4);
		
		int g = 0;
        int n = A.size();
        for(int i=0;i<n;i++){
            g = gcd(A.get(i),g);
        }
        System.out.println(g);
        System.out.println(gcd(100,100000));
	}

}
