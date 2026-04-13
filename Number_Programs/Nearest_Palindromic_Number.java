package Numbers;

import java.util.Scanner;

public class Nearest_Palindromic_Number {
	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (temp != 0) {
			int last = temp % 10;
			rev = rev * 10 + last;
			temp /= 10;

		}
		return rev == n;

	}

	public static int findNearestPalindrome(int n) {
		int i = 1;
		while (true) {
			if (isPalindrome(n - i) && isPalindrome(n + i))
				return n - i;
			if (isPalindrome(n - i))
				return n - i;
			if (isPalindrome(n + i))
				return n + i;
			i++;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		System.out.println(findNearestPalindrome(scanner.nextInt()));
		scanner.close();
	}
}
