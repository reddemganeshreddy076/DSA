package Arrays1D;

import java.util.Arrays;

public class Product_Of_Elements_Except_Itself {
	public static int product(int[] a) {
		int product = 1;// find all ele's product
		for (int ele : a)
			product *= ele;
		return product;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int product = product(a);
		for (int i = 0; i < a.length; i++)
			a[i] = product / a[i];
		System.out.println(Arrays.toString(a));

	}

}
//[120, 60, 40, 30, 24]