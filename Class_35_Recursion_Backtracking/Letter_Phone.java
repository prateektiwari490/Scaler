package Class_35_Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Letter_Phone {

	static Character[][] numberToCharMap;

	private static void generateNumberToCharMap() {
		numberToCharMap = new Character[10][5];
		numberToCharMap[0] = new Character[] { '0' };
		numberToCharMap[1] = new Character[] { '1' };
		numberToCharMap[2] = new Character[] { 'a', 'b', 'c' };
		numberToCharMap[3] = new Character[] { 'd', 'e', 'f' };
		numberToCharMap[4] = new Character[] { 'g', 'h', 'i' };
		numberToCharMap[5] = new Character[] { 'j', 'k', 'l' };
		numberToCharMap[6] = new Character[] { 'm', 'n', 'o' };
		numberToCharMap[7] = new Character[] { 'p', 'q', 'r', 's' };
		numberToCharMap[8] = new Character[] { 't', 'u', 'v' };
		numberToCharMap[9] = new Character[] { 'w', 'x', 'y', 'z' };
	}

	private static ArrayList<String> printWords(int[] numbers) {
		generateNumberToCharMap();
		ArrayList<String> stringList = printWords(numbers, numbers.length, 0, "");
		return stringList;
	}

	private static ArrayList<String> printWords(int[] numbers, int len, int numIndex, String s) {
		if (len == numIndex) {
			return new ArrayList<>(Collections.singleton(s));
		}

		ArrayList<String> stringList = new ArrayList<>();

		for (int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++) {
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(numberToCharMap[numbers[numIndex]][i].toString());
			stringList.addAll(printWords(numbers, len, numIndex + 1, sCopy));
		}
		return stringList;
	}

	public static void main(String[] args) {
		String A = "0";

		int n = A.length();
		
		int[] num = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i] = Character.getNumericValue(A.charAt(i));
		}

		System.out.println(printWords(num));

	}

}
