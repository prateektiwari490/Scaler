package Class_40_Searching_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ADD_OR_NOT {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 1, 2, 2, 1);
		int B = 3;
		
		int n = A.size();

		Collections.sort(A);
		ArrayList<Integer> ans = new ArrayList<Integer>();

        long[] prefix = new long[n+1];
        prefix[0] = 0;
        for(int i=1; i<=n; i++)
        {
            prefix[i] = prefix[i-1]+A.get(i-1);
        }

        int max_count = -1;
        int max_num = -1;
        for(int i=0; i<n; i++)
        {
            int low = 1;
            int high = i+1;
            while(low<=high)
            {
                int mid = (low+high)>>1;
                long sum = prefix[i+1]-prefix[i+1-mid];
                if(1L*A.get(i)*mid - sum <= B)
                {
                    if(mid > max_count)
                    {
                        max_count = mid;
                        max_num = A.get(i);
                    }
                    low = mid+1;
                }
                else
                    high = mid-1;
            }
        }
        ans.add(max_count);
        ans.add(max_num);
        System.out.println(ans);
	}

}
