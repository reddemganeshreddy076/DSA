package Strings;

public class String_toUpperCase {
	// without built-in methods
	public static char toUpper(char ch) {
		if (ch >= 'a' && ch <= 'z')
			ch = (char) (ch - 32);
		return ch;
	}

	public static String toUpperCase(String s) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			sb.append(toUpper(s.charAt(i)));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "MAn Of MAsses";
		System.out.println(toUpperCase(s));
		System.out.println(toUpperCase("Achha BacHHA !"));
	}

}

//
//MAN OF MASSES
//ACHHA BACHHA !