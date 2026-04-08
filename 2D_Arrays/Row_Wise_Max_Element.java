package Arrays_2D;

import java.util.Arrays;

public class Row_Wise_Max_Element {
	
	public static int[] findMax(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;

		int max[] = new int[cols];
		int k = 0;

		for (int r = 0; r < cols; r++) {
			int row_max = Integer.MIN_VALUE;
			for (int c = 0; c < rows; c++) {
				if (a[r][c] > row_max)
					row_max = a[r][c];
			}
			
			System.out.println(row_max);
			max[k++]=row_max;
		}

		return max;

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.toString(findMax(a)));
	}


}
