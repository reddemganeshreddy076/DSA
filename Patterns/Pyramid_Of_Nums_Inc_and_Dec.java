//Pattern-32

package Patterns;

import java.util.Scanner;

public class Pyramid_Of_Nums_Inc_and_Dec{
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			int temp = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
					System.out.print(c >= n ? temp-- + " " : temp++ + " ");

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
                1 2 1                 
              1 2 3 2 1               
            1 2 3 4 3 2 1             
          1 2 3 4 5 4 3 2 1           
        1 2 3 4 5 6 5 4 3 2 1         
      1 2 3 4 5 6 7 6 5 4 3 2 1       
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1     
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1   
1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 
*/