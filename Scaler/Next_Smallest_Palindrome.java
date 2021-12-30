package Scaler;

import java.math.BigInteger;

public class Next_Smallest_Palindrome {

	public static void main(String[] args) {
		String str = "4026061117300483012903885770893074783710083450145665410543800173874703980775883092103840037111606204";
		int n = str.length();

		BigInteger num = new BigInteger(str.toString());

		String s = "";
		String s1 = "";
		BigInteger num2;

		int flag9 = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '9') {
				flag9++;
			}
		}

		if (flag9 == n) {
			num2 = new BigInteger(str.toString());
			BigInteger p2 = new BigInteger("2");
			num2 = num2.add(p2);
			String s2 = num2.toString();
			System.out.println(s2);
		}

		for (int i = 0; i < n; i++) {
			if (i < n / 2) {
				s += str.charAt(i);
			} else {
				s += str.charAt(n - i - 1);
			}
		}

		if (n % 2 == 0) {
			num2 = new BigInteger(s.toString());
			int comparevalue = num.compareTo(num2);
			if (comparevalue == 1 || comparevalue == 0) {
				for (int i = 0; i < n; i++) {
					if (i == n / 2 || i == n / 2 - 1) {

						int a = s.charAt(i) + 1;
						s1 += (char) a;
					} else {
						s1 += s.charAt(i);
					}
				}
			}

		} else {
			num2 = new BigInteger(s.toString());
			int comparevalue = num.compareTo(num2);
			if (comparevalue == 1 || comparevalue == 0) {
				for (int i = 0; i < n; i++) {
					if (i == n / 2) {
						int a = s.charAt(i) + 1;
						s1 += (char) a;
					} else {
						s1 += s.charAt(i);

					}
				}
			}
		}

		if (s1.compareTo(s) == 1) {
			System.out.println(s1);
		} else {
			System.out.println(s);
		}
		System.out.println("4026061117300483012903885770893074783710083450145775410543800173874703980775883092103840037111606204");
	}

}
