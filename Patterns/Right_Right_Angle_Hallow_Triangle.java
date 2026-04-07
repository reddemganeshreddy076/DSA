//pattern-9

package Patterns;

import java.util.Scanner;

public class Right_Right_Angle_Hallow_Triangle {
	public static void right_right_angle_triangle(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (c == n || r == n || r + c == n + 1)
					System.out.print("* ");
				else 
					System.out.print("  ");

				
			}
			
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		right_right_angle_triangle(n);
		scanner.close();
	}

}


/*
 Enter n:
7
            * 
          * * 
        *   * 
      *     * 
    *       * 
  *         * 
* * * * * * * 
 */

















