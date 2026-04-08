package Arrays_2D;

public class Print_Elements_Col_Wise {
	public static void print(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;

		for (int c = 0; c < cols; c++) {
			for (int r = 0; r < rows; r++) {
				System.out.print(a[r][c] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }};
		print(a);
		
		System.out.println("\n\n");
		int[][] b= {{1,2,3,4,8},{2,3,1,4,5},{1,2,3,4,5},{-1,-2,-3,-4,-5}};
		print(b);
	}

}
