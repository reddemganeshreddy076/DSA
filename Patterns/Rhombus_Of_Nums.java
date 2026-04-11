//Pattern-42

package Patterns;

import java.util.Scanner;

public class Rhombus_Of_Nums {
	public static void printPattern(int n) {
		int temp = 1;
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && r - c <= n - 1 && r + c <= 3 * n - 1 && c - r <= n - 1) {
					System.out.print(temp++ + "   ");
				} else {
					System.out.print("    ");
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
3
        1           
    2   3   4       
5   6   7   8   9   
    10  11  12       
        13           
*/