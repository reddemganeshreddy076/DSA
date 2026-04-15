package Strings;

public class String_toLowercase {

	// without built-in methods
	public static char toLower(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		return ch;
	}

	public static String toLowercase(String s) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			sb.append(toLower(s.charAt(i)));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "MAn Of MAsses";
		System.out.println(toLowercase(s));
		System.out.println(toLowercase("Achha BacHHA !"));
	}
}
//man of masses
//achha bachha !