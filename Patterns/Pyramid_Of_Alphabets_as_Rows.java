//Pattern-29

package Patterns;

import java.util.Scanner;

public class Pyramid_Of_Alphabets_as_Rows {
	public static void printPattern(int n) {
		char ch = 'a';
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
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
                b c d                 
              e f g h i               
            j k l m n o p             
          q r s t u v w x y           
        z a b c d e f g h i j         
      k l m n o p q r s t u v w       
    x y z a b c d e f g h i j k l     
  m n o p q r s t u v w x y z a b c   
d e f g h i j k l m n o p q r s t u v 

*/