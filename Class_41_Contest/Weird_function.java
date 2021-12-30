package Class_41_Contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Weird_function {

	public static void main(String[] args) {
//		List<Integer> A = Arrays.asList(1000000000, 2, 3);

		ArrayList<Integer> A = new ArrayList<>();
		for (int i = 0; i < 50000; i++) {
			A.add(1000000000);
		}
		A.add(9);

		int n = A.size();
		int mod = 1000000007;
		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		long ans = 0, pre_sum = 0;
		for (int i = 0; i < n; i++) {
			ans += (((i * A.get(i)) % mod) - pre_sum % mod) % mod;
			pre_sum += A.get(i) % mod;
			pre_sum %= mod;
			if (cnt.containsKey(A.get(i) - 1)) {
				ans -= cnt.get(A.get(i) - 1);
				ans %= mod;
			}
			if (cnt.containsKey(A.get(i) + 1)) {
				ans += cnt.get(A.get(i) + 1);
				ans %= mod;
			}
			if (cnt.containsKey(A.get(i))) {
				cnt.put(A.get(i), cnt.get(A.get(i)) + 1);
			} else {
				cnt.put(A.get(i), 1);
			}
		}
		System.out.println(ans);
		System.out.println(ans % mod);
		System.out.println((ans + mod) % mod);
	}
}
