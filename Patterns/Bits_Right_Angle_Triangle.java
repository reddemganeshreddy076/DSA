//Pattern-14

package Patterns;

import java.util.Scanner;

public class Bits_Right_Angle_Triangle {
	public static void bits_Right_Angle_Triangle(int n) {
		int t = 1;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
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
		bits_Right_Angle_Triangle(n);
		scanner.close();

	}

}

/*Enter n : 
10
1                   
0 1                 
0 1 0               
1 0 1 0             
1 0 1 0 1           
0 1 0 1 0 1         
0 1 0 1 0 1 0       
1 0 1 0 1 0 1 0     
1 0 1 0 1 0 1 0 1   
0 1 0 1 0 1 0 1 0 1 
*/
