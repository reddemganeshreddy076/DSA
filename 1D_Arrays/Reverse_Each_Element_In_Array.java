package Arrays1D;

import java.util.Arrays;

public class Reverse_Each_Element_In_Array {
	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;

		}
		return rev;

	}

	public static void reverseEach(int[] a) {
		System.out.println("before : " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++)
			a[i] = reverse(a[i]);
		System.out.println("After : " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		reverseEach(new int[] { 123, 124, 125, 126, 127, 128, 129 });

	}
}
//before : [123, 124, 125, 126, 127, 128, 129]
//After : [321, 421, 521, 621, 721, 821, 921]
