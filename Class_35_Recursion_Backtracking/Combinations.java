package Class_35_Recursion_Backtracking;

import java.util.ArrayList;

public class Combinations {

	static ArrayList<ArrayList<Integer>> ans;
	static ArrayList<Integer> tmp;
	public static void main(String[] args) {
		int A = 1, B = 2;
		
		ans = new ArrayList<ArrayList<Integer>>();
        tmp = new ArrayList<Integer>();
        
		ans = makeCombi(A, B);
		System.out.println(ans);
	}
	
	static ArrayList<ArrayList<Integer>> makeCombi(int n, int k)
    {
        makeCombiUtil(n, 1, k);
        return ans;
    }

	static void makeCombiUtil(int n, int left, int k)
    {
        if (k == 0) {
            ans.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i = left; i <= n; ++i)
        {
            tmp.add(i);
            makeCombiUtil(n, i + 1, k - 1);
            tmp.remove(tmp.size() - 1);
        }
    }

}
