package Arrays_2D;

import java.util.Arrays;

public class Wave_Traversal {
	public static int[] traverse(int[][] a) {

		int rows = a.length;
		int cols = a[0].length;
		int[] path = new int[rows * cols];
		int k = 0;

		for (int c = 0; c < cols; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < rows; r++)
					path[k++] = a[r][c];

			} else {
				for (int r = rows - 1; r >= 0; r--)
					path[k++] = a[r][c];

			}
		}

		return path;

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.toString(traverse(a)));

	}

}

//[1, 5, 9, 13, 14, 10, 6, 2, 3, 7, 11, 15, 16, 12, 8, 4]
