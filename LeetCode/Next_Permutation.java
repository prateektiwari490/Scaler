package LeetCode;

import java.util.Arrays;

public class Next_Permutation {

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,5};
		
		int n = nums.length;
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = nums[i];
		}
		Arrays.sort(num);
		int flag = 1;
		for(int i=0;i<n;i++) {
			if(nums[i] != num[n-1-i]) {
				flag = 0;
			}
		}
		if(flag == 1) {
			for(int i=0;i<n;i++) {
				System.out.print(num[i] + " ");
			}
		}else {
			for(int i=n-1;i>0;i--) {
				if(nums[i] > nums[i-1]) {
					int temp = nums[i];
					nums[i] = nums[i-1];
					nums[i-1] = temp;
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}
