package Arrays_2D;

public class Print_Primary_and_Secondary_Diagonals_Sum {
	public static void printSum(int[][] a) {
		int rows = a.length;
//		int cols = a[0].length;
		int pds = 0, sds = 0;
		for (int r = 0; r < rows; r++) {
			pds = pds + a[r][r];
			sds = sds + a[r][rows - 1 - r];
		}
		System.out.println("Primary Diagonal Sum : " + pds);
		System.out.println("Secondary Diagonal Sum : " + sds);

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printSum(a);

	}

}
