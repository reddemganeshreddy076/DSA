//Pattern-15

package Patterns;

import java.util.Scanner;

public class Print_Numbers_Asc_Col_Wise_Right_Angle_Triangle {
	public  static void print_Numbers_Asc_Col_Wise_Right_Angle_Triangle(int n) {
	
		for (int r = 1; r <= n; r++) {
			int t = r;
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(t + " ");
					t = t+n-c;

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
		print_Numbers_Asc_Col_Wise_Right_Angle_Triangle(n);
		scanner.close();
	}
}

/*
 * Enter n : 
10
1                   
2 11                 
3 12 20               
4 13 21 28             
5 14 22 29 35           
6 15 23 30 36 41         
7 16 24 31 37 42 46       
8 17 25 32 38 43 47 50     
9 18 26 33 39 44 48 51 53   
10 19 27 34 40 45 49 52 54 55 
*/
