package Arrays1D;

import java.util.Arrays;

public class Merge_2_Arrays {
	public static int[] merge(int[] a, int[] b) {
//		if both are empty
		if (a.length == 0 && b.length == 0)
			return a;

//		one of two arrays is empty
		if (a.length == 0 && b.length != 0)
			return b;
		if (a.length != 0 && b.length == 0)
			return a;

//		if both are non-empty
		int[] res = new int[a.length + b.length];
		for (int i = 0, j = 0; i < res.length; i++) {
			if (i < a.length)
				res[i] = a[i];
			else
				res[i] = b[j++];
//				res[i] = b[i - a.length];

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[] { 1, 2, 3 }, new int[] { 10, 20, 30, 40, 50, 100 })));

	}

}

//[1, 2, 3, 10, 20, 30, 40, 50, 100]
