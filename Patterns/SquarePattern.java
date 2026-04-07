//Pattern-1

package Patterns;

import java.util.Scanner;

public class SquarePattern{
    public  static  void  squarePattern(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for rows and columns");
        int n = sc.nextInt();
        squarePattern(n);
        sc.close();

    }
}

/*
 
Enter the number for rows and columns
5

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

 */
