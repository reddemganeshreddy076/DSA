package Numbers;

import java.util.Scanner;

public class Tri_Fibonacci_Number {

	public static void printTriFibonacci(int a, int b, int c, int n) {

		if (n <= 0)
			return;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				System.out.print(a + " ");
			} else if (i == 2) {
				System.out.print(b + " ");
			} else if (i == 3) {
				System.out.print(c + " ");
			} else {
				int d = a + b + c;
				System.out.print(d + " ");

				a = b;
				b = c;
				c = d;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first term: ");
		int a = sc.nextInt();

		System.out.print("Enter second term: ");
		int b = sc.nextInt();

		System.out.print("Enter third term: ");
		int c = sc.nextInt();

		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();

		if (n < 3) {
			System.out.println("Need at least 3 terms");
		} else {
			printTriFibonacci(a, b, c, n);
		}

		sc.close();
	}
}