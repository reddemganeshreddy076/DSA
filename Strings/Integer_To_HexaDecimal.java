package Strings;

public class Integer_To_HexaDecimal {
	public static String convert(int n) {
		String hexaDecimalCode = "";
		while (n != 0) {
			int rem = n % 16;
			if (rem <= 9) {
				hexaDecimalCode = rem + hexaDecimalCode;
			} else {
				hexaDecimalCode = (char) (55 + rem) + hexaDecimalCode;
			}
			n = n / 16;
		}
		return hexaDecimalCode;
	}

	public static void main(String[] args) {
		System.out.println(convert(10));// A
		System.out.println(convert(7));// 7
		System.out.println(convert(111));// 6F
	}
}
