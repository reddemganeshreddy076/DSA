package Numbers;

import java.util.Scanner;

public class Neon_Number {
	public static boolean checkNeonNumber(int n) {
		int square = n * n;
		int sumOfDigts_after_Square = 0;
		while (square != 0) {
			int last = square % 10;
			sumOfDigts_after_Square += last;
			square /= 10;

		}

		return sumOfDigts_after_Square == n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		System.out.println(checkNeonNumber(scanner.nextInt()));
		scanner.close();
	}

}
//Enter n :
//9
//true
