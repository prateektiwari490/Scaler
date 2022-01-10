package Class_10_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Valid_Sudoku {

	public static void main(String[] args) {
//		[
//		"53..7....", 
//		"6..195...", 
//		".98....6.", 
//		"8...6...3", 
//		"4..8.3..1", 
//		"7...2...6", 
//		".6....28.", 
//		"...419..5", 
//		"....8..79"
//		]
		
		List<String> A = new ArrayList<>();
		A.add("53..7....");
		A.add("6..195...");
		A.add(".98....6.");
		A.add("8...6...3");
		A.add("4..8.3..1");
		A.add("7...2...6");
		A.add(".6....28.");
		A.add("...419..5");
		A.add("....8..79");
		
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				char c = A.get(i).charAt(j);
//				System.out.print(c + " ");
				if(c != '.') {
					int boxIndex = (i/3)*3 + j/3;
					
					if(!set.add("Row" + i + c) || !set.add("Col" + j + c)) {
						System.out.println(0);
						break;
					}
					if(!set.add("Box" + boxIndex + c)) {
						System.out.println(0);
						break;
					}
					
				}
			}
		}
		
		System.out.println(1);
		
	}

}
