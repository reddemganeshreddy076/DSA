package Strings;

public class EvenInd_Upper_OddInd_Lower {
	public static char toLower(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		return ch;
	}

	public static char toUpper(char ch) {
		if (ch >= 'a' && ch <= 'z')
			ch = (char) (ch - 32);
		return ch;
	}

	public static String changeStr(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i % 2 == 0)
				res = res + toUpper(ch);
			else
				res = res + toLower(ch);
		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(changeStr("Google.123@gmail.cOM"));
		System.out.println(changeStr("RAyalA SeeMA"));
		

	}

}
