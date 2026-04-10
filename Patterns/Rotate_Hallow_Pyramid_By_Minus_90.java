//Pattern-24

package Patterns;

import java.util.Scanner;

public class Rotate_Hallow_Pyramid_By_Minus_90 {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= n; c++) {
				if (c == n || r - c == n - 1 || r + c == n + 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter a value : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		printPattern(n);
		scanner.close();
	}

}
/*
Enter a value : 
10
                  * 
                * * 
              *   * 
            *     * 
          *       * 
        *         * 
      *           * 
    *             * 
  *               * 
*                 * 
  *               * 
    *             * 
      *           * 
        *         * 
          *       * 
            *     * 
              *   * 
                * * 
                  * 
*/

