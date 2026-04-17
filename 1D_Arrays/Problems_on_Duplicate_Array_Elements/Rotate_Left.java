package Arrays.Dups;

import java.util.Arrays;

public class Rotate_Left {
	public static void rotate(int[] a) {
		int n = a.length;
		int t = a[0];
		for (int i = 1; i < n; i++)
			a[i - 1] = a[i];
		a[n - 1] = t;
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		rotate(new int[] { 1, 2, 3, 4, 5 });// [2, 3, 4, 5, 1]

	}

}
//[2, 3, 4, 5, 1]
