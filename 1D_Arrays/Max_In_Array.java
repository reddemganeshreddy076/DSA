package Arrays1D;

import java.util.Scanner;

public class Max_In_Array {
	public static int findMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int ele : a)
			if (ele > max)
				max = ele;
		return max;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("Max : " + findMax(a));
		scanner.close();
	}
}

//Enter 4 elements : 
//1
//-1
//0
//10
//Max : 10
