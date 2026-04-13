package Arrays1D;

import java.util.Arrays;

public class Reverse_Halves_Of_Array {
	public static void reverse(int[] a, int i, int j) {
		System.out.println(i + "," + j);
		System.out.println("Before : " + Arrays.toString(a));
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("After : " + Arrays.toString(a));
		System.out.println("-".repeat(20));
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int n = a.length;
		if (n % 2 == 0) {
			reverse(a, 0, n / 2 - 1);
			reverse(a, n / 2, n - 1);
		} else {

			reverse(a, 0, n / 2 - 1);
			reverse(a, n / 2 + 1, n - 1);
		}

	}
}
//case-1
//odd-length
//0,2
//Before : [1, 2, 3, 4, 5, 6, 7]
//After : [3, 2, 1, 4, 5, 6, 7]
//--------------------
//4,6
//Before : [3, 2, 1, 4, 5, 6, 7]
//After : [3, 2, 1, 4, 7, 6, 5]
//--------------------

//case-2
//even length
//0,2
//Before : [1, 2, 3, 4, 5, 6]
//After : [3, 2, 1, 4, 5, 6]
//--------------------
//3,5
//Before : [3, 2, 1, 4, 5, 6]
//After : [3, 2, 1, 6, 5, 4]
//--------------------
