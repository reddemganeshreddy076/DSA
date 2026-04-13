package Numbers;

import java.util.Scanner;

public class Merge_Didits_Of_2_Nums {
	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;

		}
		return count;
	}

	public static int mergeDigits(int num1, int num2) {
		int den1 = (int) Math.pow(10, countDigits(num1) - 1);
		int den2 = (int) Math.pow(10, countDigits(num2) - 1);
		int res = 0;

		while (den1 > 0 || den2 > 0) {
//			for each iteration take digits of 2 nums

			if (den1 > 0) {
				int last = num1 / den1;
				res = res * 10 + last;
				num1 = num1 % den1;
				den1 /= 10;
			}
			if (den2 > 0) {
				int last = num2 / den2;
				res = res * 10 + last;
				num2 = num2 % den2;
				den2 /= 10;

			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(mergeDigits(104, 40));
		System.out.println(mergeDigits(1000, 10));
		System.out.println(mergeDigits(1234, 12345));
		System.out.println(mergeDigits(1234, 1230985));

		scanner.close();

	}

}
