package Arrays1D;

import java.util.Scanner;

public class Average_Of_Prime_Nums_In_Array {
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;
		return true;

	}

	public static double avg(int[] a) {
		double sum = 0;
		int count = 0;
		for (int ele : a)
			if (isPrime(ele)) {
				sum += ele;
				count++;
			}
		return sum / count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements : ");
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		System.out.println("The avg of prime ele's in array :" + avg(a));
		scanner.close();
	}

}

//Enter elements : 
//2
//3
//5
//10
//The avg of prime ele's in array :3.3333333333333335
