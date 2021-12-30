package Scaler;

import java.util.ArrayList;
import java.util.List;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// 4, 5, 6, 7, 0, 1, 2, 3
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		int target = 1; 
		
		int l = 0;
		int h = arr.size()-1;
		int mid;
		while(l<=h) {
			mid = (l+h)/2;
			if(arr.get(mid) == target) {
				System.out.println(mid);
				break;
			}
			else if(arr.get(l) <= arr.get(mid)) {
				if(target >= arr.get(l) && target <= arr.get(mid)) {
					h = mid - 1;
				}
				else {
					l = mid + 1;
				}
			}
			else if(arr.get(mid) <= arr.get(h)) {
				if(target >= arr.get(mid) && target <= arr.get(h)) {
					l = mid + 1;
				}
				else {
					h = mid - 1;
				}
			}
		}
		

	}

}
