package Arrays1D;

import java.util.Scanner;

public class Second_Max_In_Array {
	public static int findSecondMax(int[] a) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int ele : a) {

			if (ele > firstMax) {
				secondMax = firstMax;
				firstMax = ele;

			}

			if (ele > secondMax && ele < firstMax)
				secondMax = ele;
		}

		return secondMax;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("Third Max : " + findSecondMax(a));
		scanner.close();
	}

}

//
//Enter 4 elements : 
//5
//-15
//17
//-1
//Second Max : 5

