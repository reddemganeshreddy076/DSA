package Numbers;

import java.util.Scanner;

public class Fibonacci_Series {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            printFibonacci(n);
        }

        sc.close();
    }
}