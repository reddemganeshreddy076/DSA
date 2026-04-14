package Arrays1D.Seggregation;

import java.util.Arrays;

public class Even_Odds {

	public static int[] seggregate(int[] a) {
		int n = a.length;
		int res[] = new int[n];

		int i = 0, j = n - 1;
		int l = 0, m = n - 1;

		while (i < n && j >= 0) {
			if (a[i] % 2 == 0)
				res[l++] = a[i];

			if (a[j] % 2 == 1)
				res[m--] = a[j];

			i++; 
			j--; 
		}
		return res;
	}

	public static void main(String[] args) {
//		int res[] = seggregate(new int[] { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1 });
		int res[] = seggregate(new int[] { 2, 1, 3, 4, 5, 6, 7, 34, 21, 90 });
		System.out.println(Arrays.toString(res));
	}

}
//[2, 4, 6, 34, 90, 1, 3, 5, 7, 21]