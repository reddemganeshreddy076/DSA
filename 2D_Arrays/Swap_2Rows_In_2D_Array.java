package Arrays_2D;

import java.util.Arrays;

public class Swap_2Rows_In_2D_Array {
	public static void swap(int[][] a, int row1, int row2) {
//		since 2d array contains references of 1d array ..
//		swap 2 references
		int rows = a.length;
		if (row1 != row2 && row1 >= 0 && row1 < rows && row2 >= 0 && row2 < rows) {
			System.out.println("previously : " + Arrays.deepToString(a));
			int[] temp = a[row1];
			a[row1] = a[row2];
			a[row2] = temp;
			System.out.println("result : " + Arrays.deepToString(a));

		}
		else {
			System.out.println("Invalid row values entered");
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		swap(a, 1, 3);

	}

}
