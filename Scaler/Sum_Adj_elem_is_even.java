package Scaler;

import java.util.ArrayList;

public class Sum_Adj_elem_is_even {

	public static void main(String[] args) {
		//[1, 2, 3, 4, 5]
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		if(evenCount>oddCount) {
			System.out.println(oddCount);
		}else {
			System.out.println(evenCount);
		}
		
		
		
	}

}
