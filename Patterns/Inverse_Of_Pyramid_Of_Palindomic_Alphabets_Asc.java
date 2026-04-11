//Pattern-38

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Pyramid_Of_Palindomic_Alphabets_Asc {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			char temp='a';
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r <= c && r + c <= 2 * n) {
					System.out.print(c < n ? temp++ + " " : temp-- + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println("enter n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		printPattern(n);
		scanner.close();
	}

}
/*
enter n : 
10
a b c d e f g h i j i h g f e d c b a 
  a b c d e f g h i h g f e d c b a   
    a b c d e f g h g f e d c b a     
      a b c d e f g f e d c b a       
        a b c d e f e d c b a         
          a b c d e d c b a           
            a b c d c b a             
              a b c b a               
                a b a                 
                  a                   
*/