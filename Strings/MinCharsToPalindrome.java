package Strings;

class MinCharsToPalindrome {
	public static void main(String[] args) {
		String str = "abc";
		int count = 0;

		while (!isPalindrome(str)) {
			str = str.substring(0, str.length() - 1);
			count++;
		}
		System.out.println(count);
	}

	static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
