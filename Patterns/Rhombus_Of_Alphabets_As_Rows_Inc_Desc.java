//Pattern-45

package Patterns;

import java.util.Scanner;

public class Rhombus_Of_Alphabets_As_Rows_Inc_Desc {
	public static void printPattern(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && r - c <= n - 1 && r + c <= 3 * n - 1 && c - r <= n - 1) {
					System.out.print(r <= n ? (char) (96 + r) + "   " : (char) (96 + 2 * n - r) + "   ");
				} else {
					System.out.print("    ");
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
6
                    a                       
                b   b   b                   
            c   c   c   c   c               
        d   d   d   d   d   d   d           
    e   e   e   e   e   e   e   e   e       
f   f   f   f   f   f   f   f   f   f   f   
    e   e   e   e   e   e   e   e   e       
        d   d   d   d   d   d   d           
            c   c   c   c   c               
                b   b   b                   
                    a                       


*/