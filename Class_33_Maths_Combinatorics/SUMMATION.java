package Class_33_Maths_Combinatorics;

public class SUMMATION {
	
	static void initialize(int[][] l,int A, int m)
    {
         l[0][0] = 1;
        for (int i = 1; i < A+1; i++) {
            l[i][0] = 1;
            for (int j = 1; j < i+1; j++) {
                 l[i][j] = (l[i - 1][j - 1]%m + l[i - 1][j]%m)%m;
            }
        }
    }
	
	static int pow2(int r,int m) {
		int pow = 1;
		int i=1;
		while(i<=r) {
			pow *= 2;
			pow = pow%m;
		}
		return (1<<r);
	}

	public static void main(String[] args) {
		int A = 39;
		int m = 1000000007;
		
		int l[][] = new int[A+1][A+1];
        initialize(l,A, m);
        System.out.println();
        long sum = 0;
        for(int i=0;i<=A;i++) {
        	sum += (l[A][i]%m * i%m * (i-1)%m * pow2(i-2,m)%m)%m;
        	System.out.println(sum + " " + l[A][i]%m + " " + i%m + " " + (i-1)%m + " " + pow2(i-2,m));
        }
        System.out.println(sum);
	}

}
