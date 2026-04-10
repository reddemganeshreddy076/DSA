//Pattern-30

package Patterns;

import java.util.Scanner;

public class Pyramid_Of_Bits {
	public static void printPattern(int n) {

		for (int r = 1; r <= n; r++) {
			int t = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
					System.out.print((t & 1) + " ");
					t++;

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
                1 0 1                 
              1 0 1 0 1               
            1 0 1 0 1 0 1             
          1 0 1 0 1 0 1 0 1           
        1 0 1 0 1 0 1 0 1 0 1         
      1 0 1 0 1 0 1 0 1 0 1 0 1       
    1 0 1 0 1 0 1 0 1 0 1 0 1 0 1     
  1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1   
1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 

*/
