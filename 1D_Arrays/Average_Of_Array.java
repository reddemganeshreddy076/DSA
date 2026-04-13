package Arrays1D;

import java.util.Scanner;

public class Average_Of_Array {
	public static double avg(int[] a) {
		double sum = 0;
		for (int ele : a)
			sum += ele;
		return sum / a.length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("The avg of ele's in array :" + avg(a));
		scanner.close();
	}

}

/*
 * Enter elements :
 * 1 2 3 4 
 * The avg of ele's in array :2.5
 */