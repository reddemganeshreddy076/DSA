package Strings;

class LongestPalindromeSubstring {
	public static void main(String[] args) {
		String str = "babad";
		String longest = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				if (isPalindrome(sub) && sub.length() > longest.length()) {
					longest = sub;
				}
			}
		}
		System.out.println(longest);
	}

	static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);

	}

}
