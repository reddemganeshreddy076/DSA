//Pattern-4

package Patterns;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void rightAngledTriangle(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		rightAngledTriangle(n);
		scanner.close();
		
	}

}


/*

Enter n:
10

*                   
* *                 
* * *               
* * * *             
* * * * *           
* * * * * *         
* * * * * * *       
* * * * * * * *     
* * * * * * * * *   
* * * * * * * * * * 

*/
