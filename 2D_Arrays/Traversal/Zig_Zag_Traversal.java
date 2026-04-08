package Arrays_2D;

import java.util.Arrays;

public class Zig_Zag_Traversal {
	public static int[] traverse(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		int path[] = new int[rows * cols];
		int k = 0;

		for (int r = 0; r < a.length; r++) {

			if (r % 2 == 0)
				for (int c = 0; c < a.length; c++)
					path[k++] = a[r][c];

			else
				for (int c = a.length - 1; c >= 0; c--)
					path[k++] = a[r][c];

		}
		return path;

	}

	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(Arrays.toString(traverse(a)));

	}

}


//[1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12, 16, 15, 14, 13]

