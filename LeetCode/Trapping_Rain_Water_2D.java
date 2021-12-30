package LeetCode;

public class Trapping_Rain_Water_2D {
	public static int max(int a, int b){
        return a>b?a:b;
    }
	public static int min(int a, int b){
        return a>b?b:a;
    }
    public static int trap(int[] height) {
        int len = height.length;
        
        if(len == 0) {
        	return 0;
        }
        
        int maxLeft[] = new int[len];
        int maxRight[] = new int[len];
        maxLeft[0] = height[0];
        maxRight[len-1] = height[len-1];
		System.out.println(" maxLeft: " +maxLeft[0] + " ");
        for(int i=1;i<len;i++) {
        	if(height[i] > maxLeft[i-1]) {
        		maxLeft[i] = height[i];
        		System.out.println(" if: " +maxLeft[i] + " ");
        	}else {
        		maxLeft[i] = maxLeft[i-1];
        		System.out.println(" else: " +maxLeft[i] + " ");
        	}
        }
		System.out.println(" maxRight: " +maxRight[len-1] + " ");
        for(int i=len-2;i>=0;i--) {
        	if(height[i] > maxRight[i+1]) {
        		maxRight[i] = height[i];
        		System.out.println(" if: " +maxRight[i] + " ");
        	}else {
        		maxRight[i] = maxRight[i+1];
        		System.out.println(" else: " +maxRight[i] + " ");
        	}
        }
        
        int water = 0;
        
        for(int i=0;i<len;i++) {
        	water += (min(maxLeft[i], maxRight[i]) - height[i]);
        }
        
        
        return water;
    }

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//		trap(arr);
		System.out.println(trap(arr));
	}

}
