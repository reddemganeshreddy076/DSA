//Pattern-54

package Patterns;

import java.util.Scanner;

public class Rotate_Hallow_ButterFly_Top_Part_By_Minus_90 {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= n; c++) {
				if (r + c == 2 * n || c == r || c == n || r == 1 || r == 2 * n - 1) {
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
* * * * * * * * * * 
  *               * 
    *             * 
      *           * 
        *         * 
          *       * 
            *     * 
              *   * 
                * * 
                  * 
                * * 
              *   * 
            *     * 
          *       * 
        *         * 
      *           * 
    *             * 
  *               * 
* * * * * * * * * * 

*/