package Arrays.Dups;

import java.util.Arrays;

public class Rotate_Array_Right_Side {
	public static void rotate(int[] a) {
		int n = a.length;
		int t = a[n - 1];
		for (int i = n - 2; i >= 0; i--)
			a[i + 1] = a[i];
		a[0] = t;
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		rotate(new int[] { 1, 2, 3, 4, 5 });

	}

}
//[5, 1, 2, 3, 4]