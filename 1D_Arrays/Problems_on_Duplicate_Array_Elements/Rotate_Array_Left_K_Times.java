package Arrays.Dups;

import java.util.Arrays;

public class Rotate_Array_Left_K_Times {
	public static void rotateK(int[] a, int k) {
		int n = a.length;
		for (int start = 0; start < k; start++) {
			int t = a[0];
			for (int i = 1; i < n; i++)
				a[i - 1] = a[i];
			a[n - 1] = t;
			System.out.println(Arrays.toString(a));
		}

	}

	public static void main(String[] args) {
		rotateK(new int[] { 1, 2, 3, 4, 5 }, 3);

	}

}

//[2, 3, 4, 5, 1]
//[3, 4, 5, 1, 2]
//[4, 5, 1, 2, 3]