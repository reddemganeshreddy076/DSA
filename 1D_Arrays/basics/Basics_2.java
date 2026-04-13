package Arrays1D.basics;

import java.util.Arrays;

public class Basics_2 {
	// access array elements
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

//		System.out.println(a[0]); 1
//		System.out.println(a[10]);AIOOBE
//		System.out.println(a[-1]);AIOOBE

		// Print elements
//		approach-1
		for (int ele : a)
			System.out.print(ele + " ");
		System.out.println();

//		approach-2
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

//		approach-3	
		System.out.print(Arrays.toString(a));
	}

}
