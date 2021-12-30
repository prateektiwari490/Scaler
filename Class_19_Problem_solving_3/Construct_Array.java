package Class_19_Problem_solving_3;

import java.util.ArrayList;

public class Construct_Array {
	
	public static boolean checkExists(ArrayList<Integer> A, int n)
	{
	    for(int i = 0; i < A.size(); i++)
	    {
	        if (A.get(i) == n)
	            return true;
	    }
	    return false;
	}

	public static void main(String[] args) {
		int A = 5;
		int B = 20;
		int C = 50;
		
		ArrayList<Integer> out = new ArrayList<Integer>();
	    int min_ele = Integer.MAX_VALUE;
	    for(int a = 1; a <= B; a++)
	    {
	        for(int d = 1; d <= C - B; d++)
	        {
	        	ArrayList<Integer> temp = new ArrayList<Integer>();
	            for(int i = 0; i < A; i++)
	            {
	                temp.add(a + (i * d));
	            }
	            
	            int last_ele = temp.get(A - 1);
	            if (min_ele > last_ele && checkExists(temp, B) && checkExists(temp, C))
	            {
	            
	                min_ele = last_ele;
	                out = temp;
	            }
	        }
	    }
	    System.out.println(out);		
	}

}
