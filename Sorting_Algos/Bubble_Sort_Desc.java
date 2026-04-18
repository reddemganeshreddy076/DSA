package sorting_algos;

import java.util.Arrays;

public class Bubble_Sort_Desc {
	public static void sort(int[] a) {
		for (int i = 0, n = a.length; i < n - 1; i++)
			for (int j = 0; j < n - 1 - i; j++)
				if (a[j] < a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
		System.out.println(Arrays.toString(a));// [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 3, 2, 2, 1, 1]

	}

	public static void main(String[] args) {
		sort(new int[] { 1, 2, 3, 2, 1, 4, 5, 6, 8, 7, 3, 9, 10, 12, 11 });
	}

}
