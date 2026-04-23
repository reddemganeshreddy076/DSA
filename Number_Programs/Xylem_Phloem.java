package Numbers;

public class Xylem_Phloem {
	public static boolean approach1(int n) {
		int sEndDigits = 0, sInternalDigits = 0;
		sEndDigits = n % 10;
		n = n / 10;
		while (n > 9) {
			sInternalDigits = sInternalDigits + (n % 10);
			n /= 10;
		}
		sEndDigits += n;
		n = n / 10;
		return sEndDigits == sInternalDigits;
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;

	}

	public static boolean approach2(int n) {
		int sInternalDigits = 0, sExternalDigits = 0;
		int countOfDigits = count(n);
		int den = (int) Math.pow(10, countOfDigits - 1);
		sExternalDigits = (n % 10) + (n / den);
		int sum = 0;

		while (n != 0) {
			sum += (n % 10);
			n /= 10;

		}
		sInternalDigits = sum - sExternalDigits;
		return sExternalDigits == sInternalDigits;
	}

	public static void main(String[] args) {
		System.out.println(approach1(1011102));// true
		System.out.println(approach1(950501));// true
		System.out.println(approach1(9448119));// true
		System.out.println(approach1(10001));//false

		System.out.println(approach2(1011102));// true
		System.out.println(approach2(950501));// true
		System.out.println(approach2(9448119));// true
		System.out.println(approach2(10001));//false

	}

}
