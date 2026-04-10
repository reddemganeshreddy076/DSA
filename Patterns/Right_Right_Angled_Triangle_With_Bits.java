//Pattern-16  

package Patterns;

import java.util.Scanner;

public class Right_Right_Angled_Triangle_With_Bits {
	public static void printPattern(int n) {

		for (int r = 1; r <= n; r++) {
			int t = 1;
			for (int c = 1; c <= n; c++) {

				if (r + c >= n + 1) {
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
		System.out.println("Enter a value : ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		printPattern(n);
		scanner.close();
		
		
//		printPattern(new Scanner(System.in).nextInt());

	}

}
/*
Enter a value : 
10
                  1 
                1 0 
              1 0 1 
            1 0 1 0 
          1 0 1 0 1 
        1 0 1 0 1 0 
      1 0 1 0 1 0 1 
    1 0 1 0 1 0 1 0 
  1 0 1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 0 

*/