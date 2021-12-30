package LeetCode;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int res[] = new int[n-k+1];
		
		for(int i=0;i<k;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		res[0] = max;
		
		int j = k;
		int m = 1;
		while(j<n) {
			if(max < arr[j]) {
				max = arr[j];
			}
			res[m++] = max;
			j++;
		}
		
		for(int l = 0;l<n-k+1;l++) {
			System.out.print(res[l] + " ");
		}
		
	}

}
