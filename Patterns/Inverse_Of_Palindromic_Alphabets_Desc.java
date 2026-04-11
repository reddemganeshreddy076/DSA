//Pattern-39

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Palindromic_Alphabets_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			char temp = (char) ('a' + n);
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r <= c && r + c <= 2 * n) {
					System.out.print(c >= n ? temp++ + " " : temp-- + " ");
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
k j i h g f e d c b c d e f g h i j k 
  k j i h g f e d c d e f g h i j k   
    k j i h g f e d e f g h i j k     
      k j i h g f e f g h i j k       
        k j i h g f g h i j k         
          k j i h g h i j k           
            k j i h i j k             
              k j i j k               
                k j k                 
                  k                   
*/