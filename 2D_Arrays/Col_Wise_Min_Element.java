package Arrays_2D;

import java.util.Arrays;

public class Col_Wise_Min_Element {
	public static int[] findMin(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;

		int min[] = new int[cols];
		int k = 0;

		for (int c = 0; c < cols; c++) {
			int col_min = Integer.MAX_VALUE;
			for (int r = 0; r < rows; r++) {
				if (a[r][c] < col_min)
					col_min = a[r][c];
			}

			System.out.println(col_min);
			min[k++] = col_min;
		}

		return min;

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.toString(findMin(a)));
	}

}
