//Pattern-53

package Patterns;

import java.util.Scanner;

public class Exclude_Rhombus_Of_Nums_As_Rows_Inc_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r - c >= n - 1 || r + c <= n + 1 || r + c >= 3 * n - 1 || c - r >= n - 1) {
					System.out.print(r > n ? (2 * n - r) + " " : r + " ");
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
5
1 1 1 1 1 1 1 1 1 
2 2 2 2   2 2 2 2 
3 3 3       3 3 3 
4 4           4 4 
5               5 
4 4           4 4 
3 3 3       3 3 3 
2 2 2 2   2 2 2 2 
1 1 1 1 1 1 1 1 1 
*/