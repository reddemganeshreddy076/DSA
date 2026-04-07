//Pattern-6

package Patterns;

import java.util.Scanner;

public class InverseRightAngleTriangle2 {
	public static void inverseRightAngleTriangle2(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r + c <= n + 1)
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
//		int n = scanner.nextInt();
		System.out.println(10);

		int n = 10;
		inverseRightAngleTriangle2(n);
		scanner.close();

	}

}

/*
 Enter n:
10
* * * * * * * * * * 
* * * * * * * * *   
* * * * * * * *     
* * * * * * *       
* * * * * *         
* * * * *           
* * * *             
* * *               
* *                 
*      

 */

