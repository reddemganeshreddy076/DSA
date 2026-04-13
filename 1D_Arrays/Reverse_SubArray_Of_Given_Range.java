package Arrays1D;

import java.util.Arrays;

public class Reverse_SubArray_Of_Given_Range {
	public static void reverse(int[] a, int start, int end) {
		System.out.println("Before : " + Arrays.toString(a));
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("After : " + Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		reverse(a,1,5);
	}

}


//Before : [1, 2, 3, 4, 5, 6, 7, 8, 9]
//After : [1, 6, 5, 4, 3, 2, 7, 8, 9]