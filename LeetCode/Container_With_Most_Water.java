package LeetCode;

public class Container_With_Most_Water {
	
	public static int min(int a, int b){
        return a>b?b:a;        
    }

	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		int max = 0;
        int j = arr.length-1;
        int i = 0;
        while(i<j){
            int res = min(arr[i],arr[j])*(j-i);
            if(max<res) {
            	max = res;
            }
            if(arr[i]<arr[j]) {
            	i++;
            }else {
            	j--;
            }
        }
        System.out.println(max);
	}
}
