package Arrays_2D;

import java.util.Arrays;

public class Swap_2Cols_In_2DArray {
	public static void swap2Cols(int[][] a, int col1, int col2) {
		int cols = a[0].length;
		if (col1 >= 0 && col1 < cols && col2 >= 0 && col2 < cols) {

			System.out.println("previously : ");
			System.out.println(Arrays.deepToString(a));

			int rows = a.length;
			for (int r = 0; r < rows; r++) {
				int temp = a[r][col1];
				a[r][col1] = a[r][col2];
				a[r][col2] = temp;
			}
			System.out.println("After swapping : ");
			System.out.println(Arrays.deepToString(a));
		} else {
			System.out.println("Invalid cols entered");
		}

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		swap2Cols(a, 1, 3);

	}

}
