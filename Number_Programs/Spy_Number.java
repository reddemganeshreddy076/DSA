package Numbers;

import java.util.Scanner;

public class Spy_Number {
	public static boolean checkSpyNumber(int n) {
		int sumOfDigits = 0;
		int productOfDigits = 1;
		int temp = n;
		while (temp != 0) {
			int last = temp % 10;
			sumOfDigits += last;
			productOfDigits *= last;
			temp /= 10;
		}

		return sumOfDigits == productOfDigits;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		System.out.println(checkSpyNumber(scanner.nextInt()));
		scanner.close();
	}

}

//Enter n :
//123
//true
