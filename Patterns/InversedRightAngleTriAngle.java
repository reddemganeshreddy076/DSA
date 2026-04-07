//Pattern-3

package Patterns;

import java.util.Scanner;

public class InversedRightAngleTriAngle {
	public static void inversedRightAngleTriangle(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if(r<=c)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for rows and cols: ");
		int n = sc.nextInt();
		inversedRightAngleTriangle(n);
		sc.close();

	}
}

/*
Enter a number for rows and cols: 
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