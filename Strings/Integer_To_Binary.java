package Strings;

public class Integer_To_Binary {
	public static String convert(int n) {
		String binaryCode = "";
		while (n != 0) {
			int rem = n % 2;
			binaryCode = rem + binaryCode;
			n = n / 2;
		}
		return binaryCode;
	}
	public static void main(String[] args) {
		System.out.println(convert(10));// 1010
		System.out.println(convert(7));// 111
		System.out.println(convert(111));// 1101111
	}
}
