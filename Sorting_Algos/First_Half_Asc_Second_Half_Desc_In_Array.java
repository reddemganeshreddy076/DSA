package sorting_algos;

import java.util.Arrays;

public class First_Half_Asc_Second_Half_Desc_In_Array {
	public static int[] sortAsc(int[] a, int start, int end) {
		for (int i = start; i < end; i++)
			for (int j = i + 1; j < end; j++)
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
		System.out.println(Arrays.toString(a));
		return a;

	}

	public static int[] sortDesc(int[] a, int start, int end) {
		for (int i = start; i < end; i++)
			for (int j = i + 1; j < end; j++)
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
		System.out.println(Arrays.toString(a));
		return a;
	}

	public static void main(String[] args) {
//		int[] a = new int[] { 5,4,3,2,1,10,20,30,40};
//		[2, 3, 4, 5, 1, 10, 20, 30, 40]
//		[2, 3, 4, 5, 1, 40, 30, 20, 10]

		int[] a = new int[] { 5, 4, 3, 2, 10, 20, 30, 40 };
//		[2, 3, 4, 5, 10, 20, 30, 40]
//		[2, 3, 4, 5, 40, 30, 20, 10]

		int[] res = sortAsc(a, 0, a.length / 2);
		if (a.length % 2 == 0) {
			sortDesc(res, a.length / 2, a.length);
		} else {
			sortDesc(res, a.length / 2 + 1, a.length);
		}
	}

}
