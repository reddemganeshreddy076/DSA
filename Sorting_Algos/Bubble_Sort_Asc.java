package sorting_algos;

import java.util.Arrays;

public class Bubble_Sort_Asc {
	public static void sort(int[] a) {
		for (int i = 0, n = a.length; i < n - 1; i++)
			for (int j = 0; j < n - 1 - i; j++)
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
		System.out.println(Arrays.toString(a));//[1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	}

	public static void main(String[] args) {
		sort(new int[] { 1, 2, 3, 2, 1, 4, 5, 6, 8, 7, 3, 9, 10, 12, 11 });
	}

}
