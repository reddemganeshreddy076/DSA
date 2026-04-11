//Pattern-36

package Patterns;

import java.util.Scanner;

public class Inverse_Of_Pyramid_Of_Palindromic_Nums_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= n; r++) {
			int temp = n;
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

10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 
  10 9 8 7 6 5 4 3 2 3 4 5 6 7 8 9 10   
    10 9 8 7 6 5 4 3 4 5 6 7 8 9 10     
      10 9 8 7 6 5 4 5 6 7 8 9 10       
        10 9 8 7 6 5 6 7 8 9 10         
          10 9 8 7 6 7 8 9 10           
            10 9 8 7 8 9 10             
              10 9 8 9 10               
                10 9 10                 
                  10                   

*/