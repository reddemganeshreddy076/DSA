//Pattern-40

package Patterns;

import java.util.Scanner;

public class Rotate_Pyramid_Of_Palindromic_Nums_Asc_By_90 {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			int temp = 1;
			for (int c = 1; c <= n; c++) {
				if (r + c >= n + 1 && r - c <= n - 1) {
					System.out.print(temp++ + " ");
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
                  1 
                1 2 
              1 2 3 
            1 2 3 4 
          1 2 3 4 5 
        1 2 3 4 5 6 
      1 2 3 4 5 6 7 
    1 2 3 4 5 6 7 8 
  1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10 
  1 2 3 4 5 6 7 8 9 
    1 2 3 4 5 6 7 8 
      1 2 3 4 5 6 7 
        1 2 3 4 5 6 
          1 2 3 4 5 
            1 2 3 4 
              1 2 3 
                1 2 
                  1 
*/