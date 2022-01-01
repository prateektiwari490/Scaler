package Class_73_Greedy_Algorithms;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Finish_Maximum_Jobs {
	static class Pair {

		int first;
		int second;

		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	static void SelectActivities(int s[], int f[]) {

		ArrayList<Pair> ans = new ArrayList<>();
		PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.first - p2.first);

		for (int i = 0; i < s.length; i++) {
			p.add(new Pair(f[i], s[i]));
		}

		Pair it = p.poll();
		int start = it.second;
		int end = it.first;
		ans.add(new Pair(start, end));

		while (!p.isEmpty()) {
			Pair itr = p.poll();
			System.out.println(itr.second + " " + itr.first);
			if (itr.second >= end) {
				start = itr.second;
				end = itr.first;
				ans.add(new Pair(start, end));
			}
		}
//		System.out.println("Following Activities should be selected. \n");
		int count = 0;
		for (Pair itr : ans) {
			count++;
//			System.out.println("Activity started at: " + itr.first + " and ends at " + itr.second);
		}
		System.out.println(count);
	}
	public static void main(String[] args) {

		int s[] = { 1, 5, 7, 1 };
		int f[] = { 8, 8, 8, 7 };

		SelectActivities(s, f);
	}
}