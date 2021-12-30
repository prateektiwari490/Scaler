package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {

	public static void main(String[] args) {
		int[] nums = new int[] { 2,2,2,2 };
		int target = 8;

		Arrays.sort(nums);

		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> res;
		int n = nums.length;		
		if(n == 4) {
			if(nums[0] + nums[1] + nums[2] + nums[3] == target) {
				res = new ArrayList<Integer>();
				res.add(nums[0]);
				res.add(nums[1]);
				res.add(nums[2]);
				res.add(nums[3]);
				ans.add(res);
				System.out.println(ans);
			}
		}
		
		for (int i = 0; i < n - 3; i++) {
			for (int j = i + 1; j < n - 2; j++) {
				int k = j + 1;
				int l = n - 1;
				while (k < l) {
					int currSum = nums[i] + nums[j] + nums[k] + nums[l];
					if (currSum == target) {
						res = new ArrayList<Integer>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[k]);
						res.add(nums[l]);
						ans.add(res);
						k++;
						l--;
						
					} else if (currSum > target) {
						l--;
					} else {
						k++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
