//Pattern-13

package Patterns;

import java.util.Scanner;

public class Alphabets_Continuos_Right_Angled_Triangle {
	public static void alphabets_Continuos_Right_Angled_Triangle(int n) {

		char ch = 'A';
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
				

			}
			ch++;
			if (ch > 'Z')
				ch = 'A';
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		alphabets_Continuos_Right_Angled_Triangle(n);
		scanner.close();

	}

}

/*
 * Enter n : 
10
A                   
B B                 
C C C               
D D D D             
E E E E E           
F F F F F F         
G G G G G G G       
H H H H H H H H     
I I I I I I I I I   
J J J J J J J J J J 
*/
