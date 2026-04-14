package Arrays1D.Seggregation;

import java.util.Arrays;

public class Positives_Negatives {
	public static int[] seggregate(int[] a) {
		int n = a.length;
		int res[] = new int[n];

		int i = 0, j = n - 1;
		int l = 0, m = n - 1;

		while (i < n && j >= 0) {
			if (a[i] >= 0)
				res[l++] = a[i];

			if (a[j] < 0)
				res[m--] = a[j];

			i++;
			j--;
		}
		return res;
	}

	public static void main(String[] args) {
//		int res[] = seggregate(new int[] { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1 });

		int res[] = seggregate(new int[] { 0,2, -1, 3, 4, 0,-5, 6, -7, -34, 21, 90 });
		System.out.println(Arrays.toString(res));
	}
}

//[0, 2, 3, 4, 0, 6, 21, 90, -1, -5, -7, -34]
