package Strings;

public class Remove_All_Adjacent_Dups_Using_String {
	public static String remove(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s = s.substring(0, i) + s.substring(i + 2);
				i = -1;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(remove("abbaa"));// a
		System.out.println(remove("abbaa"));// empty

	}
}
