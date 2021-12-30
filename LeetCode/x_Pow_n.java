package LeetCode;

public class x_Pow_n {

	public static void main(String[] args) {
		double x = 2.1;
		int n = 3;
		double ans = 1.0;
        long num = n;
        if(num<0) num = -1 * num;
        while(num>0){
            if(num%2 == 0){
                x = x*x;
                num = num/2;
            }
            else{
                ans = ans*x;
                num = num-1;
            }
        }
        if(n<0) ans = (double)(1.0)/(double) ans;
        System.out.println(ans);
	}
}
