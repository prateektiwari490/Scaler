package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Three_Sum {

	public static void main(String[] args) {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };

		Arrays.sort(nums);
		int n = nums.length;
		List<List<Integer>> ans = new ArrayList<>();
		TreeSet<String> set = new TreeSet<String>();

		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int currentSum = nums[i] + nums[j] + nums[k];
				System.out.println(currentSum);
				if (currentSum == 0) {
					String str = nums[i] + ":" + nums[j] + ":" + nums[k];
					ArrayList<Integer> arr = new ArrayList<Integer>();

					if (!set.contains(str)) {
						arr.add(nums[i]);
						arr.add(nums[j]);
						arr.add(nums[k]);
						ans.add(arr);
						set.add(str);
					}

					j++;
					k--;
				} else if (currentSum > 0) {
					k--;
				} else {
					j++;
				}
			}
		}

		System.out.println(ans);
	}

}
