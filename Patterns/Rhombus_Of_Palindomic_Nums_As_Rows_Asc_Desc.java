//Pattern-47

package Patterns;

import java.util.Scanner;

public class Rhombus_Of_Palindomic_Nums_As_Rows_Asc_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			int temp = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && r - c <= n - 1 && r + c <= 3 * n - 1 && c - r <= n - 1) {
					System.out.print(c < n ? temp++ + " " : temp-- + " ");
					temp++;
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
        1         
      1 3 3       
    1 3 5 5 5     
  1 3 5 7 7 7 7   
1 3 5 7 9 9 9 9 9 
  1 3 5 7 7 7 7   
    1 3 5 5 5     
      1 3 3       
        1         
*/