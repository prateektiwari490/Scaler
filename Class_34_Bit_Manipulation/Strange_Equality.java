package Class_34_Bit_Manipulation;

public class Strange_Equality {

	public static void main(String[] args) {
		int A = 5;

		int num = A;
		int count = 0;
		String str = "";
		while (num != 0) {
			count++;
			if ((num & 1) == 1) {
				str += "0";
			} else {
				str += "1";
			}
			num = num >> 1;
		}

		int B = 1 << count;
		int C = 0;

		int p = 0;
		for (int i = 0; i < str.length(); i++) {
			int c = Character.getNumericValue(str.charAt(i));
			C += (int) (c * Math.pow(2, p++));
		}
		System.out.println(B ^ C);
	}

}
