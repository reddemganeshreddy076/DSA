package Arrays_2D;

//import java.util.Arrays;

public class Print_Elements_Row_Wise {
	public static void print_Row_Wise(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.print(a[r][c] + "  ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{1,2,3,4},{2,3,4,5}};
		print_Row_Wise(a);


	}

}
