package Scaler;

import java.util.ArrayList;

public class Balance_Array {

	public static void main(String[] args) {
		//[5, 5, 2, 5, 8]
		//[ 2, 1, 6, 4 ]
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(6);
		arr.add(4);
//		arr.add(8);
		
		int n = arr.size();
        int preEven[] = new int[n];
        int preOdd[] = new int[n];
        int suffEven[] = new int[n];
        int suffOdd[] = new int[n];
        
        preEven[0] = arr.get(0);
        preOdd[0] = 0;
        
        for(int i=1;i<n;i++){
            if(i%2 == 0){
                preEven[i] = preEven[i-1] + arr.get(i);
                preOdd[i] = preOdd[i-1];
            }else{
                preEven[i] = preEven[i-1];
                preOdd[i] = preOdd[i-1] + arr.get(i);
            }
//            System.out.println(preEven[i] + " " + preOdd[i]);
        }
        
        if(n%2!=0) {
        	suffEven[n-1] = arr.get(n-1);
            suffOdd[n-1] = 0;
        }else {
        	suffEven[n-1] = 0;
            suffOdd[n-1] = arr.get(n-1);
        }
        
//        System.out.println();
        for(int i=n-2;i>=0;i--){
            if(i%2 == 0){
            	suffEven[i] = suffEven[i+1] + arr.get(i);
            	suffOdd[i] = suffOdd[i+1];
            }else{
            	suffEven[i] = suffEven[i+1];
            	suffOdd[i] = suffOdd[i+1] + arr.get(i);
            }
//            System.out.println(suffEven[i] + " " + suffOdd[i]);
        }
        int ans = 0;
        int even;
        int odd;
        
        for(int i=0;i<n;i++){
        	if(i == 0) {
        		even = suffOdd[i+1];
        		odd = suffEven[i+1];
        	}else if(i == n-1) {
        		even = preEven[i-1];
        		odd = preOdd[i-1];
        	}else {
        		even = preEven[i-1] + suffOdd[i+1];
        		odd = preOdd[i-1] + suffEven[i+1];
        	}
        	
        	if(even == odd) {
        		ans++;
        	}
        }
        
        System.out.println(ans);
	}

}
