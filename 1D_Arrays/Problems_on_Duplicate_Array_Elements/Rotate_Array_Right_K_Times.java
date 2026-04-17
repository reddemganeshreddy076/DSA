package Arrays.Dups;

import java.util.Arrays;

public class Rotate_Array_Right_K_Times {
	public static void rotateK(int[] a, int k) {
		int n = a.length;
		for(int start=0;start<k;start++) {
			int t = a[n - 1];
			for (int i = n - 2; i >= 0; i--)
				a[i + 1] = a[i];
			a[0] = t;
			System.out.println(Arrays.toString(a));
		}

	}

	public static void main(String[] args) {
		rotateK(new int[] { 1, 2, 3, 4, 5 }, 3);

	}

}
//[5, 1, 2, 3, 4]
//[4, 5, 1, 2, 3]
//[3, 4, 5, 1, 2]

