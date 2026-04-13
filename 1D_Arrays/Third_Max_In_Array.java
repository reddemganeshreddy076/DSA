package Arrays1D;

import java.util.Scanner;

public class Third_Max_In_Array {
	public static int findSecondMax(int[] a) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int ele : a) {

			if (ele > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = ele;

			}

			else if (ele > secondMax && ele < firstMax) {
				thirdMax = secondMax;
				secondMax = ele;
			} else if (ele > thirdMax && ele < secondMax && ele < thirdMax) {
				thirdMax = ele;

			}
		}

		return thirdMax;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("Third Max : " + findSecondMax(a));
		scanner.close();
	}
}


//Enter 4 elements : 
//1
//23
//12
//25
//Third Max : 12