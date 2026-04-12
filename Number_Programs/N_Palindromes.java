package Numbers;

import java.util.Scanner;

public class N_Palindromes {

	public static boolean isPalindrome(int n) {
		int original = n;
		int rev = 0;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		return original == rev;
	}

	public static void printNPalindromes(int start, int n) {
		int count = 0;
		int num = start;

		while (count < n) {
			if (isPalindrome(num)) {
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start value: ");
		int start = sc.nextInt();

		System.out.print("Enter n: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Invalid input");
		} else {
			printNPalindromes(start, n);
		}

		sc.close();
	}
}