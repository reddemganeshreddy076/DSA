//Pattern-56

package Patterns;

import java.util.Scanner;

public class Exclude_Rhombus_Of_Nums_As_Cols {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r - c >= n - 1 || r + c <= n + 1 || r + c >= 3 * n - 1 || c - r >= n - 1) {
					System.out.print(c + " ");
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
1 2 3 4 5 6 7 8 9 
1 2 3 4   6 7 8 9 
1 2 3       7 8 9 
1 2           8 9 
1               9 
1 2           8 9 
1 2 3       7 8 9 
1 2 3 4   6 7 8 9 
1 2 3 4 5 6 7 8 9 

*/