package Arrays1D;

import java.util.Scanner;

public class Second_Min_In_Array {
	public static int findSecondMin(int[] a) {
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int ele : a) {

			if (ele < firstMin) {
				secondMin = firstMin;
				firstMin = ele;

			}

			if (ele < secondMin && ele > firstMin)
				secondMin = ele;
		}

		return secondMin;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("Second Min : " + findSecondMin(a));
		scanner.close();
	}
}
//Enter 4 elements : 
//2
//3
//4
//-90
//Second Min : 2
