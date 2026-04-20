package Strings;

public class Longest_palindromic_SubString {
	public static boolean isPalindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}

	public static String longestPalindrome(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isPalindrome(sub)) {
					if (sub.length() > res.length()) {
						res = sub;
					}
				}

			}
		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbabb"));//bbabb
		System.out.println(longestPalindrome("abbabba"));//abbabba
		
	}

}
