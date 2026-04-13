package Arrays1D;

import java.util.Scanner;

public class Third_Min_In_Array {
	public static int findThirdMin(int[] a) {
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;

		for (int ele : a) {

			if (ele < firstMin) {
				thirdMin = secondMin;
				secondMin = firstMin;
				firstMin = ele;

			} else if (ele < secondMin && ele > firstMin) {
				thirdMin = secondMin;
				secondMin = ele;

			} else if (ele < thirdMin && ele > firstMin && ele > secondMin)
				thirdMin = ele;
		}

		return thirdMin;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 6 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt() };
		System.out.println("Third Min : " + findThirdMin(a));
		scanner.close();
	}

}


//Enter 6 elements : 
//4
//5
//6
//7
//8
//-90
//Third Min : 5
