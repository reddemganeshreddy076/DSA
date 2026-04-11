//Pattern-34

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Pyramid_Of_Bits {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r <= c && r + c <= 2 * n) {
					System.out.print((r + c) % 2 == 0 ? 1 + " " : 0 + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter n :");
		int n = scanner.nextInt();
		scanner.close();
		printPattern(n);
	}

}

//output
/*
enter n :
10
1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 
  1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1   
    1 0 1 0 1 0 1 0 1 0 1 0 1 0 1     
      1 0 1 0 1 0 1 0 1 0 1 0 1       
        1 0 1 0 1 0 1 0 1 0 1         
          1 0 1 0 1 0 1 0 1           
            1 0 1 0 1 0 1             
              1 0 1 0 1               
                1 0 1                 
                  1                   
*/