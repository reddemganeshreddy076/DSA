//Pattern-8

package Patterns;

import java.util.Scanner;

public class InverseRightAngleHallowTriangle {
	public static void inverseRightAngleHallowTriangle(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				if(r==1|| r==c||c==n)
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
		int n=scanner.nextInt();
		inverseRightAngleHallowTriangle(n);
		scanner.close();
		
	}
	

}


/*
Enter n:
5
* * * * * 
  *     * 
    *   * 
      * * 
        * 
*/