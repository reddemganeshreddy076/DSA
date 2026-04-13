package Arrays1D;

import java.util.Arrays;

//to merge 2 arrays, traverse first array from left to right , and another from right to left..

public class Merge_2_Arrays_In_Zig_Zag_Order {
	public static int[] merge(int[] a, int[] b) {
//		if both arrays are empty
		if (a.length == 0 && b.length == 0) {
			return a;
		}

//		if one of two arrays is empty
		if (a.length == 0 && b.length != 0) {
			return b;
		}
		if (a.length != 0 && b.length == 0) {
			return a;
		}

//		if both arrays Are not empty

		int[] res = new int[a.length + b.length];
		int i = 0, j = b.length - 1, k = 0;
		while (k < res.length) {
			if (i < a.length)
				res[k++] = a[i++];
			if (j >= 0)
				res[k++] = b[j--];

		}
		return res;
	}

	public static void main(String[] args) {
		int[] res = merge(new int[] { 1, 2, 3, 4 }, new int[] { 10, 20, 30, 40, 50 });
		System.out.println(Arrays.toString(res));

	}

}


//[1, 50, 2, 40, 3, 30, 4, 20, 10]
