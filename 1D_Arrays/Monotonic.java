package Arrays1D;

import java.util.Arrays;

public class Monotonic {
	public static int[] revSort(int[] arr) {
		Arrays.sort(arr);
		int s = 0, e = arr.length - 1;
		while (s < e) {
			arr[s++] = arr[e--];
		}
		return arr;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 5, 2, 3, 45, 67 };//false
		int arr[] = { 1, 2, 3, 4, 5 }; // true
		int temp1[] = Arrays.copyOf(arr, arr.length);
		int temp2[] = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp1);
		revSort(temp2);
		System.out.println(Arrays.equals(temp1, arr) || Arrays.equals(temp2, arr));
	}
}
