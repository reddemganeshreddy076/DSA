//Pattern-37

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Pyramid_Of_Alphabets_Asc {
	public static void printPattern(int n) {
		char ch = 'a';
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r <= c && (r + c <= 2 * n )) {
					System.out.print(ch++ + " ");
				} else {
					System.out.print("  ");
				}
				if (ch > 'z')
					ch = 'a';
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
a b c d e f g h i j k l m n o p q r s 
  t u v w x y z a b c d e f g h i j   
    k l m n o p q r s t u v w x y     
      z a b c d e f g h i j k l       
        m n o p q r s t u v w         
          x y z a b c d e f           
            g h i j k l m             
              n o p q r               
                s t u                 
                  v                   
*/