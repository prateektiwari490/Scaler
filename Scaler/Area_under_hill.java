package Scaler;

import java.util.ArrayList;

public class Area_under_hill {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(3);
				
		int n = arr.size();
		int i = 0;
		float area = 0;
		while(i<n) {
			if(i == 0) {
				area = area + (float)arr.get(i)/2;
				System.out.println(" 0 = " +area);
			}
			else if(i == n-1) {
				area = area + (float)arr.get(i)/2;
				System.out.println(" n-1= " +area);
				area += (arr.get(i)>arr.get(i-1)?arr.get(i-1):arr.get(i));
				System.out.println(" n-1 & i-1= " + area);
				area += (float)(Math.abs(arr.get(i)-arr.get(i-1)))/2;
				System.out.println(" n-1 & abs= " + area);
			}
			else {
				area += (arr.get(i)>arr.get(i-1)?arr.get(i-1):arr.get(i));
				System.out.println(" i-1= " + area);
				area += (float)(Math.abs(arr.get(i)-arr.get(i-1)))/2;
				System.out.println(" abs= " + area);
			}
			i++;
		}
	}

}
