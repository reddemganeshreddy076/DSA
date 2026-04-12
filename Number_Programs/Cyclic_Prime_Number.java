package Numbers;

import java.util.Scanner;

public class Cyclic_Prime_Number {

    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int base, int exponent) {
        int pow = 1;
        while (exponent != 0) {
            pow = pow * base;
            exponent--;
        }
        return pow;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static int rotate(int n) {
        int countOfDigits = count(n);
        int denominator = power(10, countOfDigits - 1);

        int last = n % 10;
        int remainingNum = n / 10;

        return last * denominator + remainingNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = scanner.nextInt();

        int countOfDigits = count(n);
        boolean isCyclic = true;
        int temp = n;

        while (countOfDigits > 0) {
            if (!isPrime(temp)) {
                isCyclic = false;
                break;
            }
            temp = rotate(temp);
            countOfDigits--;
        }

        System.out.println(isCyclic ? "Cyclic Prime" : "Not Cyclic Prime");

        scanner.close();
    }
}