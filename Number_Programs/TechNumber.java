package Numbers;

import java.util.Scanner;

public class TechNumber {

	public static int count(int n) {
		int countOfDigits = 0;
		while (n != 0) {
			countOfDigits++;
			n /= 10;
		}
		return countOfDigits;
	}

	public static int power(int base, int exponent) {
		int pwr = 1;
		while (exponent > 0) {
			pwr *= base;
			exponent--;
		}
		return pwr;
	}

	public static boolean isTechNum(int n) {
		int digits = count(n);

		// Must have even number of digits
		if (digits % 2 != 0) {
			return false;
		}

		int half = digits / 2;
		int divisor = power(10, half);

		int firstHalf = n / divisor;
		int secondHalf = n % divisor;

		int sum = firstHalf + secondHalf;

		return (sum * sum == n);
	}

	public static void main(String[] args) {
//        int n = 2025;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();

		scanner.close();
		if (isTechNum(n)) {
			System.out.println(n + " is Tech Number");
			// 2025,3025,9801,81
		} else {
			System.out.println(n + " is Not a Tech Number");
		}

	}
}