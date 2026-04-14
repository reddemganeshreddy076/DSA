package Arrays1D;

import java.util.Arrays;

public class Sum_Of_Elements_Except_Itself {

	public static int sum(int[] a) {
		int sum = 0;// find all ele's sum
		for (int ele : a)
			sum += ele;
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = sum(a);
		for (int i = 0; i < a.length; i++)
			a[i] = sum - a[i];
		System.out.println(Arrays.toString(a));

	}

}
//[14, 13, 12, 11, 10]