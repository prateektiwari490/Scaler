package Class_35_Recursion_Backtracking;

import java.util.Arrays;
import java.util.List;

public class Sudoku {

	public static final int GRID_SIZE = 9;

	private static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][column] == number) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;

		for (int i = localBoxRow; i < localBoxRow + 3; i++) {
			for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
				if (board[i][j] == number) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column)
				&& !isNumberInBox(board, number, row, column);
	}

	private static boolean solveBoard(int[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			for (int column = 0; column < GRID_SIZE; column++) {
				if (board[row][column] == 0) {
					for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
						if (isValidPlacement(board, numberToTry, row, column)) {
							board[row][column] = numberToTry;
							if (solveBoard(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

//		List<List<Character>> A = Arrays.asList(Arrays.asList('5', '3', '.', '.', '7', '.', '.', '.', '.'),
//				Arrays.asList('6', '.', '.', '1', '9', '5', '.', '.', '.'),
//				Arrays.asList('.', '9', '8', '.', '.', '.', '.', '6', '.'),
//				Arrays.asList('8', '.', '.', '.', '6', '.', '.', '.', '3'),
//				Arrays.asList('4', '.', '.', '8', '.', '3', '.', '.', '1'),
//				Arrays.asList('7', '.', '.', '.', '2', '.', '.', '.', '6'),
//				Arrays.asList('.', '6', '.', '.', '.', '.', '2', '8', '.'),
//				Arrays.asList('.', '.', '.', '4', '1', '9', '.', '.', '5'),
//				Arrays.asList('.', '.', '.', '.', '8', '.', '.', '7', '9'));

		int board[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
		if (solveBoard(board)) {
			for (int i = 0; i < GRID_SIZE; i++) {
				for (int j = 0; j < GRID_SIZE; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("cannot solve the board");
		}

	}

}
