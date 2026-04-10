//Pattern-19

package Patterns;

import java.util.Scanner;

public class Right_Right_Angle_Triangle_With_Col_Val {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r + c >= n + 1) {
					System.out.print(c + " ");

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
                  10 
                9 10 
              8 9 10 
            7 8 9 10 
          6 7 8 9 10 
        5 6 7 8 9 10 
      4 5 6 7 8 9 10 
    3 4 5 6 7 8 9 10 
  2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
*/