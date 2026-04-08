package Arrays_2D;

import java.util.Arrays;

public class Reverse_EachArray_In_2D_Array {
	public static void reverse(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;

			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for(int i=0;i<a.length;i++)
			reverse(a[i]);
		System.out.println(Arrays.deepToString(a));

	}

}

//[[4, 3, 2, 1], [8, 7, 6, 5], [12, 11, 10, 9], [16, 15, 14, 13]]
