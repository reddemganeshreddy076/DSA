package Numbers;

import java.util.Scanner;

public class Nearest_Prime_Number {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				return false;
		return true;

	}

	public static int findNearestPrime(int n) {
		int i = 1;
		while (true) {
			if (isPrime(n - i) && isPrime(n + i))
				return n - i;
			if (isPrime(n - i))
				return n - i;
			if (isPrime(n + i))
				return n + i;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		System.out.println(findNearestPrime(scanner.nextInt()));
		scanner.close();
	}

}
