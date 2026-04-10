//Pattern-21

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Pyramid_Of_Stars {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (c >= r && r + c <= n * 2) {
					System.out.print("* ");

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
* * * * * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * * *   
    * * * * * * * * * * * * * * *     
      * * * * * * * * * * * * *       
        * * * * * * * * * * *         
          * * * * * * * * *           
            * * * * * * *             
              * * * * *               
                * * *                 
                  *                   
*/