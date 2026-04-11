//Pattern-48

package Patterns;

import java.util.Scanner;

public class Butterfly_Of_Stars_Top_Part {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r >= c || r + c >= n * 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		printPattern(n);
		scanner.close();
	}

}

/*
Enter n : 
10
*                                   * 
* *                               * * 
* * *                           * * * 
* * * *                       * * * * 
* * * * *                   * * * * * 
* * * * * *               * * * * * * 
* * * * * * *           * * * * * * * 
* * * * * * * *       * * * * * * * * 
* * * * * * * * *   * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * 
*/