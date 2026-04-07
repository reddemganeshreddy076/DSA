//Pattern-12

package Patterns;

import java.util.Scanner;

public class Row_Wise_Alphabets_Right_Angle_Pattern {

	public static void row_Wise_Alphabets_Right_Angle_Pattern(int n) {
		char ch = 'A';
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(ch++ + " ");

				} else {
					System.out.print("  ");
				}
				if (ch > 'Z')
					ch = 'A';
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		row_Wise_Alphabets_Right_Angle_Pattern(n);
		scanner.close();

	}

}
/*
Enter n: 
10
A                   
B C                 
D E F               
G H I J             
K L M N O           
P Q R S T U         
V W X Y Z A B       
C D E F G H I J     
K L M N O P Q R S   
T U V W X Y Z A B C 

*/