//Pattern-28

package Patterns;

import java.util.Scanner;

public class Pyramid_Of_Nums_As_Rows {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
					System.out.print(r + "  ");

				} else {
					System.out.print("   ");

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
8
                     1                       
                  2  2  2                    
               3  3  3  3  3                 
            4  4  4  4  4  4  4              
         5  5  5  5  5  5  5  5  5           
      6  6  6  6  6  6  6  6  6  6  6        
   7  7  7  7  7  7  7  7  7  7  7  7  7     
8  8  8  8  8  8  8  8  8  8  8  8  8  8  8  

*/