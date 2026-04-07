//pattern-10

package Patterns;

import java.util.Scanner;

public class Up_Left_Right_Angle_Hallow_Triangle {
	public static void up_Left_Right_Angle_Hallow_Triangle(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r == 1 || c == 1 || r + c == n + 1) {
					System.out.print("* ");

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
		up_Left_Right_Angle_Hallow_Triangle(n);
		scanner.close();

	}

}


/*
Enter n : 
10
* * * * * * * * * * 
*               *   
*             *     
*           *       
*         *         
*       *           
*     *             
*   *               
* *                 
*                    
                  
*/