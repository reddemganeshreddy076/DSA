package Numbers;

import java.util.Scanner;

public class Nth_Prime_Number {

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int nthPrime(int n) {
		int count = 0;
		int num = 1;

		while (count < n) {
			num++;
			if (isPrime(num)) {
				count++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Invalid input");
		} else {
			int result = nthPrime(n);
			System.out.println("Nth Prime = " + result);
		}

		sc.close();
	}
}
