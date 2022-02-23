package Class_40_Searching_I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median_of_Array {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-50, -41, -40, -19, 5, 21, 28);
		List<Integer> B = Arrays.asList(-50, -21, -10);

		if (A.size() > B.size())
			System.out.println(findMedian(B, 0, B.size(), A, (A.size() + B.size()) % 2 == 0));
//			return findMedian(B, 0, B.size(), A, (A.size() + A.size()) % 2 == 0);

//		return findMedian(A, 0, A.size(), B, (A.size() + B.size()) % 2 == 0);
		System.out.println(findMedian(A, 0, A.size(), B, (A.size() + B.size()) % 2 == 0));
	}

	static double findMedian(List<Integer> a, int s, int e, List<Integer> b, boolean isEven) {
		int pX = (s + e) / 2;
		int pY = (a.size() + b.size() + 1) / 2 - pX;
		int xLeft = pX == 0 ? Integer.MIN_VALUE : a.get(pX - 1);
		int xRight = pX == a.size() ? Integer.MAX_VALUE : a.get(pX);
		int yLeft = pY == 0 ? Integer.MIN_VALUE : b.get(pY - 1);
		int yRight = pY == b.size() ? Integer.MAX_VALUE : b.get(pY);
		if (xLeft <= yRight && yLeft <= xRight) {
			if (isEven)
				return ((double) Math.max(xLeft, yLeft) + (double) Math.min(xRight, yRight)) / (double) 2;
			else
				return Math.max(xLeft, yLeft);
		} else if (xLeft <= yRight) {
			return findMedian(a, pX + 1, e, b, isEven);
		} else {
			return findMedian(a, s, pX - 1, b, isEven);
		}
	}
}
