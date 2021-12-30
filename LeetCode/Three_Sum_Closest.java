package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Three_Sum_Closest {

	public static void main(String[] args) {
		int[] nums = new int[] { 0,2,1,-3 };
		int target = 1;

		Arrays.sort(nums);
		int n = nums.length;
		
		int closestsum = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int currentSum = nums[i] + nums[j] + nums[k];
				if(Math.abs(target - currentSum) < Math.abs(target - closestsum)) {
					closestsum = currentSum;
				}
				
				if (currentSum > target) {
					k--;
				} else {
					j++;
				}
			}
		}

		System.out.println(closestsum);
	}

}
