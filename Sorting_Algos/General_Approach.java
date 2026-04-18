package sorting_algos;

import java.util.Arrays;

public class General_Approach {
	public static void sortAsc(int[] a) {
		for (int i = 0; i < a.length-1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
		System.out.println(Arrays.toString(a));

	}

	public static void sortDesc(int[] a) {
		for (int i = 0; i < a.length-1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		sortAsc(new int[] { 1, 5, 4, 3, 2, 1, 7, 10 });// [1, 1, 2, 3, 4, 5, 7, 10]
		sortDesc(new int[] { 1, 5, 4, 3, 2, 1, 7, 10 });// [10, 7, 5, 4, 3, 2, 1, 1]

	}

}
