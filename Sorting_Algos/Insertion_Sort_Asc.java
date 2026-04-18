package sorting_algos;

import java.util.Arrays;

public class Insertion_Sort_Asc {
	public static void sort(int[] a) {
		for (int i = 0, n = a.length; i < n; i++) {
			int t = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > t) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = t;
		}
		System.out.println(Arrays.toString(a));//[1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8]


	}

	public static void main(String[] args) {
		sort(new int[] { 1, 2, 1, 4, 3, 6, 5, 4, 8, 7, 6 });

	}

}
