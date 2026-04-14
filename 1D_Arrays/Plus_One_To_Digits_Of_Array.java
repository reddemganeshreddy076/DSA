package Arrays1D;

import java.util.Arrays;

public class Plus_One_To_Digits_Of_Array {

	public static int[] plusOne(int[] a) {

		if (a.length == 0) // handle empty
			return new int[] { 1 };

		int n = a.length;

		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == 9) {
				a[i] = 0;
			} else {
				a[i] = a[i] + 1;
				return a;
			}
		}

		// if all were 9
		int res[] = new int[n + 1];
		res[0] = 1;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] { 0, 9 })));// {1,0}
		System.out.println(Arrays.toString(plusOne(new int[] { 9, 9 })));// {1,0,0}
		System.out.println(Arrays.toString(plusOne(new int[] {})));// {1}
	}
}