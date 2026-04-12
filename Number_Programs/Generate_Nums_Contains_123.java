package Numbers;

import java.util.Scanner;

public class Generate_Nums_Contains_123 {

	public static boolean isValid(int n) {
		while (n != 0) {
			int digit = n % 10;

			if (digit != 1 && digit != 2 && digit != 3) {
				return false;
			}

			n /= 10;
		}
		return true;
	}

	public static void generateNumbers(int start, int count) {
		int num = start;
		int found = 0;

		while (found < count) {
			if (isValid(num)) {
				System.out.print(num + " ");
				found++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start value: ");
		int start = sc.nextInt();

		System.out.print("Enter how many numbers: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Invalid input");
		} else {
			generateNumbers(start, n);
		}

		sc.close();
	}
}