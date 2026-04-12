package Numbers;

import java.util.Scanner;

public class Power_Of_Base_and_exponent {
	public static double power(int base, int exponent) {
		double power = 1;
		if (exponent == 0)
			return power;
		if (exponent < 0) {
			while (exponent != 0) {
				power = (double) power / base;
				exponent++;
			}
			return power;
		}

		while (exponent != 0) {
			power = power * base;
			exponent--;
		}
		return power;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base and exponent ");
		int base = scanner.nextInt(), exponent = scanner.nextInt();
		double res = power(base, exponent);
		System.out.println(res);
		scanner.close();
	}

}
