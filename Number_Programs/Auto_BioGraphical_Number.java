package Numbers;

import java.util.Scanner;

public class Auto_BioGraphical_Number {

    public static int count(int n, int d) {
        int count = 0;
        while (n != 0) {
            int ld = n % 10;
            if (ld == d) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean isAutoBio(int n) {
        int c = countDigits(n);
        int temp = n;

        // Store digits in array (left to right)
        int[] digits = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Check condition
        for (int i = 0; i < c; i++) {
            int cnt = count(n, i);
            if (digits[i] != cnt) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println(isAutoBio(n) ? "Autobiographical" : "Not Autobiographical");
        sc.close();
    }
}