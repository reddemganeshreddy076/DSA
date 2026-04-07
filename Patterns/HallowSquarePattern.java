//Pattern-2

package Patterns;

import java.util.Scanner;

public class HallowSquarePattern {
	public static void hallowSquarePattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r == 1 || r == n || c == 1 || c == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for rows and columns");
//        int n = sc.nextInt();
		int n = 10;

		hallowSquarePattern(n);
		sc.close();

	}
}

/*
Enter the number for rows and columns
10

* * * * * * * * * * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
*                 * 
* * * * * * * * * * 

*/