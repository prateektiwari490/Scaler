package Class_35_Recursion_Backtracking;

import java.util.ArrayList;

public class N_Queens {

	public static void main(String[] args) {
		int n = 1;

		int[][] chess = new int[n][n];
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		printNQueens(ans, chess, "", 0);
		System.out.println(ans);
	}

	private static void printNQueens(ArrayList<ArrayList<String>> ans, int[][] chess, String qsf, int row) {
		if (row == chess.length) {
			System.out.println(qsf);
			ArrayList<String> arr = new ArrayList<String>();
			long num = Long.parseLong(qsf);
			for(int i=0;i<chess.length;i++) {
				String str = "";
				for(int j=0;j<chess.length;j++) {
					
					if(j == num%10) {
						str += "Q";
					}else {
						str += ".";
					}
				}
//				System.out.println(num);
				num = num/10;
				arr.add(str);
			}
			ans.add(arr);
			return;
		}
		for (int col = 0; col < chess.length; col++) {
			if (IsItSafePlaveForTheQueen(chess, row, col) == true) {
				chess[row][col] = 1;
				printNQueens(ans, chess, qsf + col, row + 1);
				chess[row][col] = 0;
			}
		}
	}

	private static boolean IsItSafePlaveForTheQueen(int[][] chess, int row, int col) {
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

}
