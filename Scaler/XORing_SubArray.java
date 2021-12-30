package Scaler;

import java.util.ArrayList;

public class XORing_SubArray {
	
	public static int solve(ArrayList<Integer> arr) {
        int len = arr.size();
        int res = 0;
        int ar[] = new int[(int) Math.pow(2, len)];
        
        for(int i=0;i<(1<<len);i++) {
        	for(int j = 0;j<len;j++) {
        		if((i & (1<<j)) >0) {
        			res = res^arr.get(j);
        			System.out.print(arr.get(j) + " ");
        		}
        	}
        	System.out.println(" res = " + res);
        }
		
		return res;
    }

	static void printSubsets(char set[])
    {
        int n = set.length;
        
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            for (int j = 0; j < n; j++)
                 
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }
 
    public static void main(String[] args)
    {
//        char set[] = {'a', 'b', 'c'};
//        printSubsets(set);
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	arr.add(3);
    	arr.add(4);
    	arr.add(5);
    	int res = solve(arr);
    	
    	System.out.println(res);
    	
    }

}
