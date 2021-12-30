package Class_33_Maths_Combinatorics;

public class Compute_nCr_mod_m {
	static void initialize(int[][] l,int A, int B,int m)
    {
         l[0][0] = 1;
        for (int i = 1; i < A+1; i++) {
            l[i][0] = 1;
            for (int j = 1; j <= Math.min(i+1,B); j++) {
                 l[i][j] = (l[i - 1][j - 1]%m + l[i - 1][j]%m)%m;
            }
        }
    }

	public static void main(String[] args) {
		int A = 5;
		int B = 2;
		int C = 13;
		
		int l[][] = new int[A+1][B+1];
        initialize(l,A,B, C);
        
        System.out.println(l[A][B]%C);
        
//        return l[A][B]%C;
	}

}
