//Pattern-46

package Patterns;

import java.util.Scanner;

public class Rhombus_Of_Bits {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			int t = 1;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && r - c <= n - 1 && r + c <= 3 * n - 1 && c - r <= n - 1) {
					System.out.print((t & 1) + " ");
					t++;
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
                  1                   
                1 0 1                 
              1 0 1 0 1               
            1 0 1 0 1 0 1             
          1 0 1 0 1 0 1 0 1           
        1 0 1 0 1 0 1 0 1 0 1         
      1 0 1 0 1 0 1 0 1 0 1 0 1       
    1 0 1 0 1 0 1 0 1 0 1 0 1 0 1     
  1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1   
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