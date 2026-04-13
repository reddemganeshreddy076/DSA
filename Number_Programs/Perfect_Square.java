package Numbers;

import java.util.Scanner;

public class Perfect_Square {
	public static boolean checkPerfectSquare(int num) {
//		int i = 1;
//		while (i * i <= num) {
//			if (i * i == num)
//				return true;
//			i++;
//		}
		for (int i = 1; i * i <= num; i++)
			if (i * i == num)
				return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		System.out.println(checkPerfectSquare(scanner.nextInt()));
		scanner.close();

	}
}
