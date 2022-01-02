package Class_70_Heaps_II;

import java.util.HashMap;
import java.util.Map;

public class Ways_to_form_Max_Heap {
	
	static int nCr(long n, long r)
    {
        long p = 1, k = 1;
        if (n - r < r) {
            r = n - r;
        }
        if (r != 0) {
            while (r > 0) {
                p *= n;
                k *= r;
                long m = __gcd(p, k);
                p /= m;
                k /= m;
 
                n--;
                r--;
            }
        }
        else {
            p = 1;
        }
        return (int)p%1000000007;
    }
 
    static long __gcd(long n1, long n2)
    {
        long gcd = 1;
 
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
	
	public static long numberOfHeaps(long n, Map<Long,Long> map) {
		if(n <= 2) {
			return 1;
		}
		
		if(map.containsKey(n)) {
			return map.get(n);
		}
		long H = (long) Math.ceil((long)((long)Math.log(n)/Math.log(2)));
		long x = (long) (Math.pow(2, H) - 1);
		
		long L = (x-1)/2 + Math.min(n-x, (x+1)/2);
		long R = (n-1) - L;
		long y = (nCr(n,L) * numberOfHeaps(L,map) * numberOfHeaps(R,map));
		
		map.put(n, y);
		System.out.println(map);
		return y;
	}

	public static void main(String[] args) {
		int A = 10;
		
		long ans = numberOfHeaps(A,new HashMap<Long,Long>());
		
		System.out.println(ans%1000000007);

	}

}
