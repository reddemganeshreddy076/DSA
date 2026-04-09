package Arrays_2D;

import java.util.Arrays;

public class Row_Wise_Min_Element {
	
	public static int[] findMax(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;

		int min[] = new int[cols];
		int k = 0;

		for (int r = 0; r < cols; r++) {
			int row_min = Integer.MAX_VALUE;
			for (int c = 0; c < rows; c++) {
				if (a[r][c] < row_min)
					row_min = a[r][c];
			}
			
			System.out.println(row_min);
			min[k++]=row_min;
		}

		return min;

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.toString(findMax(a)));
	}


}
