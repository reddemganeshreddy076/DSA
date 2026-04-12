//Pattern-58

package Patterns;

import java.util.Scanner;

public class Hallow_ButterFly_Of_Stars {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (c == 1 || c == 2 * n - 1 || r == c || r + c == 2 * n) {
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
*   *                           *   * 
*     *                       *     * 
*       *                   *       * 
*         *               *         * 
*           *           *           * 
*             *       *             * 
*               *   *               * 
*                 *                 * 
*               *   *               * 
*             *       *             * 
*           *           *           * 
*         *               *         * 
*       *                   *       * 
*     *                       *     * 
*   *                           *   * 
* *                               * * 
*                                   * 
*/