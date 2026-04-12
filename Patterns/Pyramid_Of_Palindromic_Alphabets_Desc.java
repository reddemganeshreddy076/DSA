//Pattern-61

package Patterns;

import java.util.Scanner;

public class Pyramid_Of_Palindromic_Alphabets_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			char ch = (char) ('a' + r - 1);

			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
					System.out.print(c < n ? ch-- + " " : ch++ + " ");

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
                  a                   
                b a b                 
              c b a b c               
            d c b a b c d             
          e d c b a b c d e           
        f e d c b a b c d e f         
      g f e d c b a b c d e f g       
    h g f e d c b a b c d e f g h     
  i h g f e d c b a b c d e f g h i   
j i h g f e d c b a b c d e f g h i j 
*/