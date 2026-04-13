package Arrays1D;

import java.util.*;

public class Reverse_Array {
	public static void reverse(int[] a) {
		System.out.println("Before : " + Arrays.toString(a));
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println("After : " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		reverse(new int[] { 1, 23, 23, 34, 45, 56 });
	}
}
//Before : [1, 23, 23, 34, 45, 56]
//After : [56, 45, 34, 23, 23, 1]
