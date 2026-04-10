//Pattern-17

package Patterns;

import java.util.Scanner;

public class Right_Right_Angle_Triangle_Nums_ASC {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			int temp = 1;
			for (int c = 1; c <= n; c++) {
				if (r + c >= n + 1) {
					System.out.print(temp++ + " ");

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
*/