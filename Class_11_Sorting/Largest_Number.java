package Class_11_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Largest_Number {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 30, 34, 5, 9);

		int n = A.size();

		if (n == 1) {
			System.out.println(A.get(0).toString());
		}

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = A.get(i).toString();
			System.out.print(arr[i] + " ");
		}

		Arrays.sort(arr, new Comparator<String>() {
			
			@Override
			public int compare(String a, String b) {
				
				String o1 = a+b;
				String o2 = b+a;
				
				return o2.compareTo(o1);
			}

		});
		
		if(arr[0].equals("0")) {
			System.out.println('0');
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : arr) {
			sb.append(s);
		}
		
		System.out.println(sb.toString());

	}

}
