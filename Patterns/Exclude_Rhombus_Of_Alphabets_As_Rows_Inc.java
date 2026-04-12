//Pattern-55

package Patterns;

import java.util.Scanner;

public class Exclude_Rhombus_Of_Alphabets_As_Rows_Inc {
	public static void printPattern(int n) {
		char ch = 'a';
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r - c >= n - 1 || r + c <= n + 1 || r + c >= 3 * n - 1 || c - r >= n - 1) {
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		printPattern(n);
		scanner.close();
	}

}

/*
Enter n : 
7
a b c d e f g h i j k l m 
n o p q r s   t u v w x y 
z a b c d       e f g h i 
j k l m           n o p q 
r s t               u v w 
x y                   z a 
b                       c 
d e                   f g 
h i j               k l m 
n o p q           r s t u 
v w x y z       a b c d e 
f g h i j k   l m n o p q 
r s t u v w x y z a b c d 

*/