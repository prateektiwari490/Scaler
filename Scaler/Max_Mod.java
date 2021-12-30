package Scaler;

import java.util.ArrayList;

public class Max_Mod {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		//683, 354, 95, 937, 78, 246, 319, 516, 913, 112
		// 927, 707, 374, 394, 279, 799, 878, 937, 431, 112
		arr.add(927);
		arr.add(707);
		arr.add(374);
		arr.add(394);
		arr.add(279);
		arr.add(799);
		arr.add(878);
		arr.add(937);
		arr.add(431);
		arr.add(112);
		
		int len = arr.size();
        
        if(len == 1){
            System.out.println(arr.get(0));
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        System.out.println("first = " + first + " second = " + second);
        
        for(int i=0;i<len;i++){
            if(first < arr.get(i)){
            	second = first;
                first = arr.get(i);
                System.out.println("first = " + first + " second = " + second);
            }
            if(second < arr.get(i) && first != arr.get(i)) {
            	second = arr.get(i);
                System.out.println("first = " + first + " second = " + second);
            }
        }
        if(second == Integer.MIN_VALUE) {
            System.out.println(0);
        }
        
        System.out.println(second%first);
	}

}
