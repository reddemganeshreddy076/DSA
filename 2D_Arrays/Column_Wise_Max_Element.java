package Arrays_2D;

import java.util.Arrays;

public class Column_Wise_Max_Element {
	public static int[] findMax(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;

		int max[] = new int[cols];
		int k = 0;

		for (int c = 0; c < cols; c++) {
			int col_max = Integer.MIN_VALUE;
			for (int r = 0; r < rows; r++) {
				if (a[r][c] > col_max)
					col_max = a[r][c];
			}
			
			System.out.println(col_max);
			max[k++]=col_max;
		}

		return max;

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.toString(findMax(a)));
	}

}

/*
 * 13
14
15
16
[13, 14, 15, 16]
*/
