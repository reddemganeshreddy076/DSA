package Arrays1D;

import java.util.Arrays;

public class Merge_n_Arrays {
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
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 10, 20, 30 };
		int[] ab = merge(a, b);
		System.out.println(Arrays.toString(ab));

		int c[] = { 100, 200, 500 };
		int[] abc = merge(ab, c);
		System.out.println(Arrays.toString(abc));

		int d[] = { 11, 22, 33, 44 };
		int[] abcd = merge(abc, d);
		System.out.println(Arrays.toString(abcd));

		int e[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int[] abcde = merge(abcd, e);
		System.out.println(Arrays.toString(abcde));

		int res[] = merge(merge(merge(merge(a, b), c), d), e);
		System.out.println(Arrays.toString(res));
	}

}
