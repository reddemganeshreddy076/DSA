package Strings;

public class Integer_To_Octal {
	public static String convert(int n) {
		String octalCode = "";
		while (n != 0) {
			int rem = n % 8;
			octalCode = rem + octalCode;
			n = n / 8;
		}
		return octalCode;
	}
	public static void main(String[] args) {
		System.out.println(convert(10));// 12
		System.out.println(convert(7));// 7
		System.out.println(convert(111));// 157
	}
}
