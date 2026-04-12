package Numbers;

import java.util.Scanner;

public class GCD {

	public static int findGCD(int a, int b) {

		int small = a < b ? a : b;
		int gcd = 1;
		for (int i = 2; i <= small; i++)
			if (a % i == 0 && b % i == 0)
				if (i > gcd)
					gcd = i;
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("GCD = " + findGCD(a, b));

		sc.close();
	}
}