
package Strings;

class CountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "aaa";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String sub = str.substring(i, j + 1);
				if (isPalindrome(sub))
					count++;
			}
		}
		System.out.println(count);
	}

	static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);

	}

}
