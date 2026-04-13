package Arrays1D;

import java.util.Scanner;

public class Min_In_Array {
	public static int findMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int ele : a)
			if (ele < min)
				min = ele;
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("Min : " + findMin(a));
		scanner.close();
	}

}

//Enter 4 elements : 
//-1
//-2
//-3
//-4
//Min : -4
