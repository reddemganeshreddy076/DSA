package Arrays1D;

import java.util.Arrays;

//traverse 2 arrays left to right, take one ele from 1st,and 1 from right array and repeat..

public class Merge_2_Array_Elements_Alternatively {
	public static int[] merge(int[] a, int[] b) {

//	 	if both arrays are empty
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
		int i = 0, j = 0, k = 0;
		while (k < res.length) {
			if (i < a.length)
				res[k++] = a[i++];
			if (j < b.length)
				res[k++] = b[j++];

		}

		return res;

	}

	public static void main(String[] args) {
		int[] res = merge(new int[] { 1, 2, 3, 4 }, new int[] { 10, 20, 30, 40, 50 });
		System.out.println(Arrays.toString(res));

	}

}
