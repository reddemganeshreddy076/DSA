//Pattern-59

package Patterns;

import java.util.Scanner;

public class Sand_Glass {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if ((r + c >= 2 * n && r >= c) || (c >= r && r + c <= 2 * n)) {
					System.out.print("* ");
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
                * * *                 
              * * * * *               
            * * * * * * *             
          * * * * * * * * *           
        * * * * * * * * * * *         
      * * * * * * * * * * * * *       
    * * * * * * * * * * * * * * *     
  * * * * * * * * * * * * * * * * *   
* * * * * * * * * * * * * * * * * * * 
*/